public class findUniq {
    public static double findUniq (double arr[]){
        double valorRepetido = arr[0];
        double noRepetido = arr[1]; 

        if (valorRepetido != noRepetido){
            if (valorRepetido != arr[2]){
                return valorRepetido;
            } else {
                return noRepetido;
            }
        }
        for (int i = 2; i < arr.length; i++){
            if (arr[i] != valorRepetido){
                return arr[i];
            }
        }
        return arr[0];
    }
}