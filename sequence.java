public class sequence {
    public static int sequence (int[] arr){
        int maxInicio = 0;
        int maxFinal = 0;

        for (int i = 0; i < arr.length; i++){
            maxFinal += arr[i];
        
            if (maxFinal < 0){
                maxFinal = 0;
            }

            if (maxInicio < maxFinal) {
                maxInicio = maxFinal;
            }
        }
        return maxInicio;
    }
}
