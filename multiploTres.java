
public class multiploTres {

    /*
    Crea una función en Java que reciba un array de números enteros. Por cada número, 
    si el número es múltiplo de 3, guarda el número dividido entre 3 en esa posición de 
    un nuevo array. Si el número no es múltiplo de 3, guarda el triple del número en esa
    posición del nuevo array. Devuelve el nuevo array como resultado.
     */
    public static int[] multiploTres(int[] numero) {
        int[] resultado = new int[numero.length];

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 3 == 0) {
                resultado[i] = numero[i] / 3;
            } else {
                resultado[i] = numero[i] * 3;
            }
        }
        return resultado;
    }

    /* Lo mismo pero con 5 */
    public static int[] multiploCinco(int[] numero) {
        int[] resultado = new int[numero.length];
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 5 == 0) {
                resultado[i] = numero[i] / 5;
            } else {
                resultado[i] = numero[i] * 3;
            }
        }
        return resultado;
    }


    /* Lo mismo con 8 */
    public static int[] multiploOcho(int[] numero) {
        int[] resultado = new int[numero.length];
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 8 == 0) {
                resultado[i] = numero[i] / 8;
            } else {
                resultado[i] = numero[i] * 3;
            }

        }
        return resultado;
    }
}
