package abstractex;

public abstract class AbstractTV {
    public void turnOn(){
        System.out.println("전원을 켭니다.");
    }
    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }
//모든 메서드를 구현했어도 abstract 예약어를 사용하면 추상 클래스입니다.
// 모든 추상 메서드를 구현한 클래스, 완벽한 TV 기능이 구현된 것이 아닌 TV의 공통 기능만 구현, 생성해서 사용할목적이 아닌 상속만을 위해 만든 추상 클래스
//  new 예약어로 인스턴스 생성할 수 없음
}
