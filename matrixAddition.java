public class matrixAddition {
    public static int [][] matrixAddition (int[][] a, int[][] b){
        int n = a.length;
        int [][] resultado = new int [n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado;
    }
}