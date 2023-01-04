package practice;

public class Q3 {
    public static void main(String[] args) {
        //단보다 작거나 같은 수로 곱하는 구구단 출력
        int dan;
        int times;

        for(dan=2; dan<=9; dan++){
            for(times=1; ; times++){//조건식을 생략
                if(times>dan)//단보다 큰 수이면
                    break;
                System.out.println(dan+"X"+times+"="+dan*times);
            }
            System.out.println( );
        }
    }
}
