package cooperation;

public class Bus {
    int busNumber;//버스 번호
    int passengerCount;//승객 수
    int money;//버스 수입

    //버스 번호를 매개변수로 받는 생성자, 버스번호가 생성될 때 초기화, 버스클래스 생성할 때 호출
    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    //승객이 버스를 탄 경우 구현 메서드
    public void take(int money){//return이 없을 때 void, money만 매개변수를 받아서 PassengerCount가 증가할 수 있음
        this.money += money;//버스 수입증가(기존 money에서 계속 더해나가기)
        this.passengerCount ++;//승객 수 증가, 매개변수를 안받아도 멤버변수로 선언했기 때문에 사용 가능함
    }

    //버스 정보 출력하는 메서드
    public void showInfo(){
        System.out.println("버스" + busNumber + "번의 승객은" + passengerCount+ "명이고, 수입은" + money + "입니다.");
    }

}
