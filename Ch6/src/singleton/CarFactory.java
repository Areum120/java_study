package singleton;

public class CarFactory {//한번 지어놓고 car를 계속해서 찍어내고 생성

    private static CarFactory Instance = new CarFactory();//유일한 인스턴스 생성

    private CarFactory(){
    }

    public static CarFactory getInstance(){
        if (Instance == null) {
            Instance = new CarFactory();
        }
        return Instance;
        
    }
    //singleton클래스에 Car 인스턴스 생성, Car클래스는 생성했으나 이 부분을 못짰음
    public Car createCar(){//Car 인스턴스 생성, createCar()
        Car car = new Car();//Car클래스의 Car메서드 기능 새로운 인스턴스 생성
        return car;
    }

}
