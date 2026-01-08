public class Ackermann {
    public static int Ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return Ackermann(m - 1, 1);
        } else {
            return Ackermann(m - 1, Ackermann(m, n - 1));
        }
    }
}
// Implementa la función de Ackermann(m, n) para enteros no negativos
// usando recursión: si m = 0 devuelve n + 1, si m > 0 y n = 0 llama a A(m-1, 1)
// y si m, n > 0 llama a A(m-1, A(m, n-1)).