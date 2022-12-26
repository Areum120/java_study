package alone;

import java.util.Arrays;

public class PrintAlpha {
    public static void main(String[] args) {
        // 1 2
        // 3 4
        // 5 6
        // 7 8
        char[][] al = new char[13][2];
        for (int i = 0; i < 13; i++) {
            al[i][0] = (char)(65+i*2);
            al[i][1] = (char)(66+i*2);
        }
        for (int i = 0; i < 13; i++) {
            System.out.println(al[i][0]);
            System.out.println(al[i][1]);
            System.out.println("");
        }
    }
}
