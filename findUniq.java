public class findUniq {
    public static double findUniq (double arr[]){
        for (int i = 0; i < arr.length; i++){
            int contador = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    contador++;
                }
            }
            if (contador == 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
