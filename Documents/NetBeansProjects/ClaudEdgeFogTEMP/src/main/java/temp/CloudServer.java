
package temp;
import java.util.ArrayList;
import java.util.List;

public class CloudServer {
       private List<SensorData> historial = new ArrayList<>();
      //Recibe lista de 5 en 5
      public void guardarDatos(List<SensorData> datos) {
        historial.addAll(datos);
    }
    public void mostrarResumen() {
     System.out.println("Resumen del cloud: ");
      for (SensorData d : historial) {
         System.out.println(d);
      }
   }
}

