public class sumaImpares {
    public static int sumaImpares(int a, int b) {
        if (a > b) return 0;
        int suma = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        return suma;
    }
}