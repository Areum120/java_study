package interfaceex;

public class CompleteCalc extends Calculator{
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 !=0)
            return num1/num2;
        else
            return Calc.ERROR;//나누는 수가 0인 경우에 대해 오류 반환
    }

    @Override
    public int square(int num) {
        double num3 = (double) num;//double로 형변환
        return (int)Math.pow(num3, num3);//다시 int로 형변환
    }

    public void showInfo(){
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }

//    디폴트 메서드 재정의할 수 있음.
//    @Override
//    public void description() {
//        super.description();
//    }
}
