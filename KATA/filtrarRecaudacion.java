public class filtrarRecaudacion {
    public static int[] filtarRecaudacion (int[] recaudaciones, int umbral){
        int contador = 0;
        for (int i = 0; i < recaudaciones.length; i++){
            if (recaudaciones[i] > umbral) {
                contador ++;
            }
        }
        int[] posiciones = new int [contador];
        int j = 0;
        for (int i = 0; i < recaudaciones.length; i++) {
            if (recaudaciones[i] > umbral) {
                posiciones[j] = i;
                j++;
            }
        }
        return posiciones;
    }
}
