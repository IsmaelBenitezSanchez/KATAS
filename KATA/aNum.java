public class aNum {
    // Devolver el numero entero representado por los 8 primeros digitos del NIF
    // Dar caracter y lo convierte a digito
    public static int aDigito (char c) {
        return c - '0';
    }
    public static long aNum(char[] a) {
        // Usamos un acumulador de tipo long por seguridad, ya que 8 digitos
        // pueden superar el limite de int. Extraemos cada digito y construimos
        // el numero como hariamos manualmente 
        long valor = 0;
        for (int i = 0; i < 8; i++) {
            // Acumulacion decimal
            valor = valor * 10 + aDigito(a[i]);
        }
        return valor;
    }
}