package loopexample;

//continue는 특정조건일 때 수행하지 않고 건너뛸 때 사용
public class ContinueExample {
    public static void main(String[] args) {
        int total=0;
        int num;

        for(num=1; num<= 100; num++){//100까지 반복
            if(num % 2==0)//num값이 짝수인 경우
                continue;//이후 수행 생략하고 num++수행//짝수일 경우는 더하지 않음
            total += num;
        }
        System.out.println("1부터 100까지의 홀수의 합은 "+ total+"입니다");
    }
}
