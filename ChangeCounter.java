import java.util.Arrays;

public class ChangeCounter {
/*   public static int countChange(final int money, final int[] coins) {
    int n = coins.length;
    if (money == 0) return 1;
    if (money < 0) return 0;
    if (n == 0) return 0;
    
    int primero = coins[0];
    int[] resto = Arrays.copyOfRange(coins,1, n);

    int noPrimero = countChange(money, resto);
    int conPrimero = countChange(money-primero, coins);
    int resultado = noPrimero + conPrimero;
    
    return resultado;
  } */

  public static int countChange(final int money, final int[] coins) {
    // Se crea un array que almacenara el numero de formas de dar cambio
    // para cada cantidad desde 0 hasta 'money',
    int [] formas = new int [money + 1];
    
    // Hay 1 forma de dar cambio para 0: no usar monedas.
    formas[0] = 1;
    
    // Recorremos todas las monedas disponibles
    for(int i = 0; i < coins.length; i++) {
        int moneda = coins[i];

        // Para cada suma total de cantidades posible desde el valor de la moneda
        // hasta 'money', se actualiza el numero de formas de conseguir esa cantidad.
        for (int j = moneda; j <= money; j++) {
            
            // Se suma el numero de formas de conseguir (j - moneda)
            // porque añadir esta moneda crea nuevas combinaciones.
            formas[j]= formas[j] + formas[j-moneda];
        }
    }

    // Devuelve el numero total de formas posibles de dar cambio para 'money'
    // usando las monedas disponibles,
    return formas[money];
  }

}