public class squareOrSquareRoot {
    public static int[] squareOrSquareRoot(int[] numeros) {
        // Crear un array resultado de mismo tamaño
        int[] resultado = new int[numeros.length];

        //Recorrer el array numeros
        for(int i = 0; i < numeros.length; i++) {
            //Obtener la raiz cuadrada entera
            int raiz = (int) Math.sqrt(numeros[i]);

            //Comprobar si es cuadrado perfecto
            //Si la raiz entera al cuadrado es igual al numero original
            if (raiz * raiz == numeros[i]) {
                //Guardar la raiz cuadrada en resultado
                resultado[i] = raiz;
            } else {
                //Si no es cuadrado perfecto, guardar el numero al cuadrado
                resultado[i] = numeros[i] * numeros[i];
            }
        }
        //Devolver el array resultado
        return resultado;
    }
}

/* 
1. El método recibe una lista de números.

2. Recorre cada número y para cada uno calcula su raíz cuadrada entera.

3. Verifica si la raíz al cuadrado es igual al número original, lo que significa que es cuadrado perfecto.

4. Si es cuadrado perfecto, pone la raíz cuadrada como resultado, si no, pone el número original al cuadrado.

5. Devuelve un array con los valores calculados para cada elemento. 
*/
