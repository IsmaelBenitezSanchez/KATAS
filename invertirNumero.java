public class invertirNumero {
    public static boolean esPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }
    for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
}
    public static int invertirNumero (int numero) {
        int numero = 0;
        int resto;
        while (numero > 0) {
            resto = numero % 10;
            numeroInvertido = (numeroInvertido * 10) + resto;
            numero = numero / 10;
        }
        return numeroInvertido;
    }
}