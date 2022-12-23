package cooperation;

public class Taxi {
    int taxiNumber;
    int passengerCount;
    int money;

    public Taxi(int taxiNumber){//택시 클래스 새로 생성할 때
        this.taxiNumber = taxiNumber;
    }

    public void take(int money){
        this.money += money;//money 증가
        this.passengerCount ++;//승객수 증가

    }

    //택시 정보 출력
    public void showinfo() {//매개변수 없어도 됨
        System.out.println(taxiNumber + "승객은" + passengerCount + "명이고 수입은" + money + "입니다.");
    }
    }
