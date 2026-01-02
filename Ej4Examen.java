public class Ej4Examen {
    public static String[] losAlquiladosOrden(int[] recaudacion, String[] matriculas) {
        int contador = 0;
        for (int i = 0; i < recaudacion.length; i++){
            if(recaudacion[i] > 0){
                contador++;
            }
        }
       
        int[] copiaRecaudacion = new int[recaudacion.length];
        for (int i = 0; i < recaudacion.length; i++){
            copiaRecaudacion[i] = recaudacion[i];
        }

        String[] resultado = new String[contador];
        for (int i = 0; i < contador; i++){
            int posicionMax = posicionMasRentable(copiaRecaudacion);

            resultado[i] = matriculas[posicionMax] + " " + copiaRecaudacion[posicionMax];

            copiaRecaudacion[posicionMax] = 0;
        }
        return resultado;
    }
}