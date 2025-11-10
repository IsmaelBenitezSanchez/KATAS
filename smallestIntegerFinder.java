public class smallestIntegerFinder {
    public static int findSmallestInt(int[] arr) {
        // La variable "MIN" es el primer elemento de la array
        int min = arr[0];

        // Recorre todos los elementos del array
        for (int i = 0; i < arr.length; i++) {
            // Si el elemento actual es menor que min, actualiza min
            if (arr[i] < min) {
                min = arr[i];
            }
        }
    return min;
    }
}
