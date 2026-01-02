public class EjExamen2 {
    public static String[] losAlquilados(int[] recaudacion, String[] matriculas) {
        String[] resultado = new String[matriculas.length];
        for (int i = 0; i < matriculas.length; i++) {
            resultado[i] = matriculas[i] + " " + recaudacion[i];

        }
        return resultado;
    }
}
