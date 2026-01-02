public class getMiddle {
    public static String getMiddle(String word) {
        // Guardamos longitud
        int longitud = word.length();

        // Si la longitud es impar
        if (longitud % 2 != 0) {
            // Calculamos indice cental
            int indiceCentral = longitud / 2;
            // Devolver caracter en esa posicion, convertido a String
            return Character.toString(word.charAt(indiceCentral));
        } else {
            // Si la longitud es par
            // Primer indice central
            int indicePrimero = longitud / 2 - 1;
            // Segundo indice central
            int indiceSegundo = longitud / 2;
            // Devolver los dos caracteres usando substring, + 1 para extraer tambien el indiceSegund
            return word.substring(indicePrimero, indiceSegundo + 1);
        }
    }
}
