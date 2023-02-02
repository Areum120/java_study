package practice;

public class Genesis extends Car{

    private String Gs = "Genesis";

    @Override
    public void start() {
        System.out.println(Gs + "시동을 켭니다.");
    }

    @Override
    public void drive() {
        System.out.println(Gs + "달립니다.");
    }

    @Override
    public void stop() {
        System.out.println(Gs + "멈춥니다.");
    }

    @Override
    public void turnoff() {
        System.out.println(Gs + "시동을 끕니다.");
    }
}
