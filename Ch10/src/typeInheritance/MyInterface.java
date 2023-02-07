package typeInheritance;

//인터페이스 상속은 형 상속이라고 하며, 클래스와 달리 여러 인터페이스를 상속받을 수 있다.
public interface MyInterface extends X, Y{//클래스 상속 예약어 그대로 사용
    void myMethod();
}
