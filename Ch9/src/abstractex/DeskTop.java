package abstractex;

//추상메서드를 구현한거지, 추상클래스는 아님
public class DeskTop extends Computer{//추상클래스를 상속받으면 추상메서드 포함으로 추상 메서드 모두 구현하든가, DeskTop도 추상 클래스로 만들어야 함
    @Override
    public void display() {
        System.out.println("DeskTop display");

    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing");
    }
}
