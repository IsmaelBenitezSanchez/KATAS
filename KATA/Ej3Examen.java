public class Ej3Examen {
    public static void actualizar(int[] recaudacion, 
    String[] matriculas, String matricula, int valor) {
        int posicion = buscar(matricula, matriculas);

        if (posicion != -1) {
            recaudacion[pos] += valor;
        }
    }
}