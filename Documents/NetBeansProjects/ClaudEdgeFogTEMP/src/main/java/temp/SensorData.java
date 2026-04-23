
package temp;

public class SensorData {
    private final String idSensor;
    private final double temperatura;

    public SensorData(String idSensor, double temperatura) {
        this.idSensor = idSensor;
        this.temperatura = temperatura;
    }
        public String getIdSensor() { return idSensor; }
        public double getTemperatura() { return temperatura; 
    }
      @Override
      public String toString() {
      return "Sensor ID: " + idSensor + " | Temperatura: " + String.format("%.2f", temperatura);
    }
}

