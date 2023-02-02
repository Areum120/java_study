package abstractex;

public abstract class Computer {

    public abstract void display();//하위클래스에 따라 구현이 달라짐
    public abstract void typing();//Computer에서 구현하지 않고 두 메서드 구현을 상속받는 클래스에 위임함함

   public void turnOn(){
        System.out.println("전원을 켭니다.");
    }
    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
