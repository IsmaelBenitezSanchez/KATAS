public class EjExamen1 {
    public static int buscar(String matricula, String[] array){
        for (int i = 0; i < array.length; i++){
            if ( array[i].equals(matricula)){
                return i;
            }
        }
        return -1;
    }
}
