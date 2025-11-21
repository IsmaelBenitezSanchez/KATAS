public class twoDimensionalArrayOperation {
    public static int twoDimensionalArrayOperation(int [][] array){
        int product = 1;
        for (int i = 0; i < array.length; i++){
            int filaSum = 0;

            for (int j = 0; j < array[i].length; j++){
                filaSum += array[i][j];
            }
            product *= filaSum;
        }
        return product;
    }
}