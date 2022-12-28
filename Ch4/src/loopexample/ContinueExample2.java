package loopexample;

public class ContinueExample2 {
    public static void main(String[] args) {
        //3의 배수만 출력
        int num;
        for(num=1; num<=100; num++){
            if(num % 3 !=0)//num이 3으로 나누어 떨어지지 않으면 건너띄기
                continue;
            System.out.println(num);
        }
    }
}
