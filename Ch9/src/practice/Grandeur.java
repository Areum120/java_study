package practice;

public class Grandeur extends Car {
    private String Gd = "Grandeur";

    @Override
    public void start() {
        System.out.println(Gd + "시동을 켭니다.");
    }

    @Override
    public void drive() {
        System.out.println(Gd + "달립니다.");
    }

    @Override
    public void stop() {
        System.out.println(Gd + "멈춥니다.");
    }

    @Override
    public void turnoff() {
        System.out.println(Gd + "시동을 끕니다.");
    }
}
