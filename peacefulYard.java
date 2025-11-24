public class peacefulYard {
    public static boolean peacefulYard(String[] yard, int minDistance){
     int[][] cats = new int[3][2];
     int count = 0;

        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[i].length(); j++) {
                char c = yard[i].charAt(j);
                if (c == 'L' || c == 'M' || c == 'R') {
                    cats[count][0] = i;
                    cats[count][1] = j;
                    count++;
                }
            }
        }
      if (count <= 1) return true;
            for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                int dx = cats[i][0] - cats[j][0];
                int dy = cats[i][1] - cats[j][1];
                double dist = Math.sqrt(dx * dx + dy * dy);

                if (dist < minDistance) {
                    return false;
                }
            }
        }

        return true;
  }
}