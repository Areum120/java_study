package interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 2;

        CompleteCalc calc = new CompleteCalc();//Calc, Calculator클래스는 인스턴스 생성할 수 없음
//        디폴트 메서드 사용하려면 CompleteCalc 클래스 생성

        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));
        System.out.println(calc.square(num3));
        calc.showInfo();
        calc.description();//디폴트 메서드는 인터페이스에 이미 구현, Calculator나 CompleteCalc에서 구현할 필요 없음

        //정적 메서드
        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));//인터페이스 이름 직접 참조하여 정적 메서드 호출


        //하위클래스는 상위클래스 자료형으로 묵시적 형변환
//        Calc calc = new CompleteCalc();
//        Calc newCalc = calc;
//      showInfo()는 Calc형 변수와 Calculator형 변수에서만 사용 가능


    }
}
