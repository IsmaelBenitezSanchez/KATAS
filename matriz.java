public class matriz {
    public static int [][] matriz(int [][] array) {
        int filas = array[0].length;
        int columnas = array.length;
        int[][] resultado = new int[filas][columnas];
        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                resultado[i][j] = array[i][j];
            }
        }
        return resultado;
    }
}
