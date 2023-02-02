package template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    final public void run(){//자동차 달리는 순서를 템플릿 메서드로 구현
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }



}
