public class buscaPrimosEntre {
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
    public static int[] buscaPrimosEntre (int num1, int num2) {
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        int contadorPrimos = 0;
        for (int i = min; i <= max; i++){
            if(esPrimo(i)) {
                contadorPrimos++;
            }
        }
        int[] primosEncontrados = new int[contadorPrimos];
        int indiceArray = 0;
        for (int i = min; i <= max; i++){
            if(esPrimo(i)){
                primosEncontrados[indiceArray] = i;
                indiceArray++;
            }
        }
        return primosEncontrados;
    }
}