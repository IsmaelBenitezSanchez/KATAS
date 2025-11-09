public class chineseZodiac {
    public static String chineseZodiac (int year) {
        // Array con los doce animales del ciclo chino
        String[] animals = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};

        // Array de los cinco elementos, en orden
        String[] elements = {"Wood", "Fire", "Earth", "Metal", "Water"};

        // Calculamos el indice del animal del año
        // Restamos 1924 porque ese es el inicio del ciclo, modulo 12 para repetir cada 12 años
        int animalIndex = (year - 1924) % 12;

        // Calculamos el indice dle elemento: indice de elemento cada 10 años (dura 2 años cada elementos)
        int elementIndex = ((year - 1924) % 10) / 2;

        // Resultado combinando elemento y animal
        return elements[elementIndex] + " " + animals[animalIndex];
    }
}
