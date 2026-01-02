public class Rot13 {
    public static String rot13 (String str) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' + 13) % 26);
            } else if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + 13) % 26);
            }
            resultado.append(c);
        } 
        return resultado.toString();
    }
}
