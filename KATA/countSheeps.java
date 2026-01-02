public class countSheeps {
    public static int countSheeps (Boolean[] arr) {
        // Inicir contador a 0
        int count = 0;

        // Recorre cada elemento del array
        for (int i = 0; i < arr.length; i++) {
            // Comprueba si el elemento no es null y es verdadero (true)
            if (arr[i] !=null && arr[i]){
                // Suma uno si hay una oveja
                count++;
            }
        }
        return count;
    }
    
}
