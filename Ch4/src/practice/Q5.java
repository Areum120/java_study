package practice;

public class Q5 {
    public static void main(String[] args) {
        //반복문 사용하여 모양 출력
//         *
//        ***
//       *****
//      *******
//       *****
//        ***
//         *
        int i,j;
        for(i=0; i<=6; i++) {
            if (i <= 3) {
                for (j = 0; j <= 3 - i; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= 2 * i + 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (j = 3; j <= i; j++) {
                    System.out.print(" ");
                }
                for (j = 3; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
