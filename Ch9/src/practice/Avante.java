package practice;

public class Avante extends Car{

    private String Av = "Avante";

    @Override
    public void start() {
        System.out.println(Av + "시동을 켭니다.");
    }

    @Override
    public void drive() {
        System.out.println(Av + "달립니다");
    }

    @Override
    public void stop() {
        System.out.println(Av + "멈춥니다.");
    }

    @Override
    public void turnoff() {
        System.out.println(Av + "시동을 끕니다.");
    }
}
