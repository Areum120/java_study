package template;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("====자율 주행하는 자동차====");
        Car myCar = new AICar();//인스턴스 생성
        myCar.run();//템플릿 메서드의 역할은 메서드 실행순서와 시나리오를 정의 , 단 하위 클래스에서 재정의하면 안됨, final 예약어를 사용
        //로직 흐름이 정해져 있는 프레임워크에서 많이 사용

        System.out.println("====사람이 운전하는 자동차====");
        Car hisCar = new ManualCar();
        hisCar.run();
    }
}
