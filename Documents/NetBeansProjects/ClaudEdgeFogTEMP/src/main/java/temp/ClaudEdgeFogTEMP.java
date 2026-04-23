package temp;

public class ClaudEdgeFogTEMP {
    public static void main(String[] args) {
        CloudServer cloud = new CloudServer();
        FogNode[] fogs = new FogNode[5];
        for (int i = 0; i < 5; i++) {
            fogs[i] = new FogNode(cloud, i + 1);
        }
        // Bucle hasta llegar a 20 temperaturas altas 
        while (FogNode.contadorAltas < 20) {
            for (int i = 0; i < 5; i++) { // Por cada Fog
               for (int j = 0; j < 5; j++) { // Cada Fog tiene 5 Edges
                if (FogNode.contadorAltas >= 20) break;
                    
                EdgeNode edge = new EdgeNode(fogs[i], j + 1, i + 1);
                edge.generarYEnviar();
               }
            }
        }
        System.out.println("\nSe han alcanzado las 20 temperaturas altas.");
        cloud.mostrarResumen();
    }
}
