public class Repeats {
    public static int repeats(int[] arr) {
        // Creamos variable para acumular la suma de los numeros unicos
        int suma = 0;

        // Recorremos array para analizar cada numero
        for(int i = 0; i < arr.length; i++) {
            // Contador para saber cuantas veces aparece cada numero
            int contador = 0;
            // Recorremos array nuevo para contar las repeticiones del numero actual
            for (int j = 0; j < arr.length; j++) {
                // Si tiene coincidencia, sumamos 1 al contador
                if (arr[i] == arr[j]) {
                    contador++;
                }
            }
            // Si el numero solo aparece 1 vez, lo sumamos a la variable SUMA
            if (contador == 1) {
                    suma += arr[i];
            }
        
        }
        return suma;
    }
}

