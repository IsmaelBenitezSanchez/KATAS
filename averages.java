public class averages {
      public static double[] averages(int[] numbers) {

        // Comprobando si la array es null o tiene menos de 2 elementos
        if (numbers == null || numbers.length < 2) {
            return new double[0];
        }

        // Crear un nuevo array para guardar promedios
        // Este array tendrá una posicion menos que el array original
        double[] promedios = new double[numbers.length - 1];

        // Recorrer la array hasta el menultimo elemento y calcular 
        // el promedio de cada elemento con su sucesor
        for ( int i = 0; i < numbers.length - 1; i++){
            // Sumamos el elemento actual y el siguiente, dividimos entre 2.0 asegurar decimales
            promedios[i] = (numbers[i] + numbers[i + 1]) / 2.0;
        }
        return promedios;
    }
}
