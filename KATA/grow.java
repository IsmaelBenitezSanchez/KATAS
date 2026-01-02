public class grow {
    public static int grow(int[] x) {
        int resultado = 1;
        for (int i = 0; i < x.length; i++){
            resultado = resultado * x[i];
        }
        return resultado;
    }
}

/*
Se inicializa el resultado en 1 porque es el "elemento neutro" de la multiplicación.

Se usa un bucle for para recorrer el array según su longitud (x.length).​

Se va multiplicando cada número del array por el acumulador resultado.

Al final se devuelve el resultado, que tiene el producto de todos los valores del array.
*/