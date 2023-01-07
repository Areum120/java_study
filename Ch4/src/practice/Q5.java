package practice;


public class Q5 {

    String space = " ";
    String star = "*";
    int num;

    public Q5(){

    }

    public Q5(int n){
        this.num = n;
    }

    public void printStar(int n){
        int i,j;
        if(n>=2 || n%2==0) {//n이 최소 2보다 크고 짝수일 경우
            for (i = 0; i <= n; i++) {
                if (i <= n/2) {
                    for (j = 0; j <= (n/2) - i; j++) {
                        System.out.print(" ");
                    }
                    for (j = 1; j <= 2 * i + 1; j++) {
                        System.out.print("*");
                    }
                } else {
                    for (j = 0; j <= (i - (n/2)); j++) {
                        System.out.print(" ");
                    }
                    for (j = 1; j <= ((-2*i) + (2*n+1)); j++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        else{
            System.out.print("다이아몬드가 출력되지 않습니다.");
        }

    }

    public static void main(String[] args) {
        //반복문 사용하여 모양 출력
//         *
//        ***
//       *****
//      *******
//       *****
//        ***
//         *
        Q5 q5 = new Q5();
        q5.printStar(40);

    }
}
