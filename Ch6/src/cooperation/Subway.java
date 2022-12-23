package cooperation;

public class Subway {

    int lineNumber;//지하철 노선
    int passengerCount;//승객수
    int money;//지하철 수입

    //지하철 노선번호를 매개로 받는 생성자, 지하철 클래스 생성할 때 호출, 초기화
    public Subway(int lineNumber){
        this.lineNumber = lineNumber;
    }
    //승객이 지하철에 탄 경우 구현한 메서드
    public void take(int money){
        this.money += money;//수입 증가
        this.passengerCount ++;//승객 증가
    }
    //지하철 정보 출력
    public void showinfo(){//매개변수 없어도 됨
        System.out.println(lineNumber+"호선 승객은"+passengerCount+"명이고 수입은"+money+"입니다.");
    }

}
