package practice;

public class Q2 {
    public static void main(String[] args) {

        int dan;
        int times;

        //짝수단만 출력
        for(dan=2; dan<=9; dan++){
            if(dan%2!=0)//단이 홀수이면
                continue;//skip
                for(times=1; times<=9; times++){
                    System.out.println(dan +"X"+times+"="+dan*times);
                }
                System.out.println( );
        }

    }
}
