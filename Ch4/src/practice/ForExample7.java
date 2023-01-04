package practice;

import java.util.Scanner;

public class ForExample7 {
    public static void main(String[] args) {
        int i, j;
        for(i=1; i<=4; i++){
            for(j=1; j<=4-i; j++){
//                System.out.print(5-j);
//                System.out.print(5-i);
//                System.out.print(j);//j<=5-j로 하면 j=3일때 3<=2 이므로 조건이 충족이 안돼서 안돌아감
//                System.out.print(i);
                System.out.print(" ");//5-i면 4,3,2,1이런 식으로 4번 도는거임, 5-j면 2,2,2,2,2가 나옴
            }
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            for(j=2; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
