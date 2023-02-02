package singleton;

public class CarFactoryTest {
    public static void main(String[] args) {

        CarFactory factory = CarFactory.getInstance();//singleton 패턴

        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());

    }


}
