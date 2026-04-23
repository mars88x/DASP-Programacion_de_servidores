package temp;
import java.util.ArrayList;
import java.util.List;

public class FogNode {
    private CloudServer cloud;
    private int idFog;
    private List<SensorData> buffer = new ArrayList<>();
    public static int contadorAltas = 0;

    public FogNode(CloudServer cloud, int idFog) {
        this.cloud = cloud;
        this.idFog = idFog;
    }
    public void procesarDato(SensorData dato) {
        if (contadorAltas >= 20) return;

        System.out.println("Fog " + idFog + " procesando: " + dato);
        if (dato.getTemperatura() > 30) {
            contadorAltas++;
        }
        buffer.add(dato);
        //Enviar de 5 en 5 con espera
        if (buffer.size() == 5) {
            System.out.println("Fog " + idFog + " enviando al Cloud...");
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cloud.guardarDatos(new ArrayList<>(buffer));
            buffer.clear();
        }
    }
}
