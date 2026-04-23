package temp;
import java.util.Random;

public class EdgeNode {
    private FogNode fog;
    private int idEdge;
    private int idFogPerteneciente;

    public EdgeNode(FogNode fog, int idEdge, int idFogPerteneciente) {
        this.fog = fog;
        this.idEdge = idEdge;
        this.idFogPerteneciente = idFogPerteneciente;
    }
    public void generarYEnviar() {
        Random r = new Random();
        double temp = 10 + r.nextDouble() * 30; // Entre 10 y 40 grados
        SensorData data = new SensorData("F" + idFogPerteneciente + "-E" + idEdge, temp);
        fog.procesarDato(data);
    }
}
