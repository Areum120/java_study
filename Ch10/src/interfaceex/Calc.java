package interfaceex;

import scheduler.Scheduler;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;//멤버변수 사용할 수 없으나 선언한 변수 컴파일하면 상수로 변환됨

    //사칙연산
    //무조건 상수로 인식식
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
    int square(int num);

    //디폴트 메서드
    default void description(){
        System.out.println("정수 계산기를 구현합니다.");
//        myMethod(); // 디폴트 메서드에서 private 메서드 호출
    }
    //정적 메서드: 클래스와 무관하게 사용
    static int total(int[] arr){//매개변수로 전달된 배열의 모든 요소 값을 더하는 함수
        int total = 0;
        for(int i : arr){
            total += i;
        }
//        myStaticMethod(); //정적 메서드에서 private static 메서드 호출
        return total;
    }

    //java9부터 private 메서드 사용 가능, 코드 재사용성 높임
//    private void myMethod(){
//        System.out.println("private 메서드입니다.");
//    }
//
//    private static void myStaticMethod(){
//        System.out.println("private static 메서드입니다.");
//    }


}
