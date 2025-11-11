// Verificar que un NIF tiene formato correcto:
// - 8 primeros caracteres deben ser digitos
// - El ultimo una letra mayuscula distinta a 'Ñ'
public class tieneFormatoNIF{
    public static boolean tieneFormatoNIF(char[] a){
        // Longitud debe ser exactamente 9: 8 digitos + 1 letra
        // Si no es asi, directamente devolvemos false
        if (a == null || a.length != 9) {
            return false;
        }
        // Comprobamos individualmente cada uno de los 8 primeros digitos
        // Si alguno no cumple, salimos antes con false
        for (int i = 0; i < 8, i++) {
            if (!esDigito(a[i])){
                return false;
            }
        }
        // El ultimo caracter debe ser una letra entre 'A'-'Z', pero ademas
        // explicitamente se exluye 'Ñ'
        char ultima = a[8];
        return esLetraMayuscula(ultima) && ultima != 'Ñ';
    }
    static boolean esLetraMayuscula(char caracter) {
        return 'A' <= caracter && caracter <= 'Z';
    }
    static boolean esDigito(char caracter) {
        return '0' <= caracter && caracter <= '9';
    }
}