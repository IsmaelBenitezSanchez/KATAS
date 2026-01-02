public class findMissingLetter {
    public static char findMissingLetter(char[] array){
        // Recorre la array
        for (int i = 0; i < array.length - 1; i++) {
            // Calculamos diferencia entre el codigo del caracter actual y el siguiente
            // Si la diferencia no es 1, eso indica que entre ellos falta un caracter
            if (array[i + 1] - array[i] != 1) {
                // Devolvemos el caracter faltante, sumando 1 al caracter actual
                return (char)(array[i] + 1);
            }
        }
        // Si no falta ninguna letra, devolvemos caracter nulo como valor por defecto
        return '\0';
    }
}