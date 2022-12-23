package singleton;

public class Car {

    public static int serialNum = 10000;
    public int carNum;

    public Car(){//Car클래스를 생성할 때마다 CarNum 증가
        serialNum ++;
        carNum = serialNum;
    }

    public int getCarNum(){
        return carNum;
    }

    public void setCarNum(int carNum){
        this.carNum = carNum;
    }

}
