package interfaceex;

//한 클래스가 여러 인터페이스 구현 가능
//인터페이스는 구현코드나 멤버변수를 가지기 않기 때문에 어떤 메서드 호출해야하는지 모호하지 않음
public interface Buy {
    void buy();

//    여러 인터페이스에서 디폴트 메서드 중복이 되면 두 인터페이스 구현하는 Customer클래스에서 재정의
    default void order(){
        System.out.println("구매 주문");
    }

}
