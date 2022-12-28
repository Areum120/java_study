package loopexample;

public class BreakExample1 {
    public static void main(String[] args) {
        //for문에서 break를 쓰면 반복문 빠져나오기
        int sum = 0;
        int num = 0;

        for(num = 0; sum <100; num++){//합한 값이 100보다 클 때 종료
            sum += num;
        }
        System.out.println("num:" + num);
        System.out.println("sum : " + sum);

        //num 15
        //sum 105가 나옴
        //num이 14가 되려면 break를 쓰면 됨

    }
}
