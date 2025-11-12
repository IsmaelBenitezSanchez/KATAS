public class numeroPrimosHasta {
    public static boolean esPrimo (int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % 2 == 0) {
                return false;
            }
        }
        return true;
    }


    public static int numeroPrimosHasta (int ulti) {
        int contador = 0;
        for (int i = 1; i <= ulti; i++) {
            if (esPrimo(i)){ 
               contador++;
            }
            
        }
        return contador;
    }
}