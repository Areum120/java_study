package practice;

public class Sonata extends Car{

    private String Sn = "Sonata";

    @Override
    public void start() {
        System.out.println(Sn + "시동을 켭니다.");
    }

    @Override
    public void drive() {
        System.out.println(Sn + "달립니다.");
    }

    @Override
    public void stop() {
        System.out.println(Sn + "멈춥니다.");
    }

    @Override
    public void turnoff() {
        System.out.println(Sn + "시동을 끕니다.");
    }



}
