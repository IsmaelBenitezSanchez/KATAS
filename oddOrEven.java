public class oddOrEven {
    public static String oddOrEven (int[] array) {
        int suma = 0;
        // Longitud de la array es 0, la suma seguira dando 0
        if (array.length == 0){
            suma = 0;
        // Sino, recorrera toda la array y suma contiene el total de todos los valores de la array
        } else {
            for (int i = 0; i < array.length; i++){
                suma += array[i];
            }
        }
        // Si es par devuelve even
        if (suma % 2 == 0) {
            return "even";
        // Sino, devuelve impar
        } else {
            return "odd";
        }
    }
}
