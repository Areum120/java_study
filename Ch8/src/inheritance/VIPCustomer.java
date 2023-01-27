package inheritance;

public class VIPCustomer {
    //Customer 클래스와 겹치는 멤버 변수
    private int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;

    //VIP고객 관련 기능 멤버 변수
    private int agentID; //VIP고객 담당 상담원 아이디
    double saleRatio;

    public VIPCustomer(){
        customerGrade = "VIP";//고객 등급
        bonusRatio = 0.05;//보너스 적립 5%
        saleRatio = 0.1;//할인율 10%
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio); // 할인율 적용

    }

    public int getAgentID(){
        return agentID; //VIP고객에게만 필요한 메서드
    }

    public String showCustomerInfo(){
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    //Customer 클래스와 겹치는 멤버 변수와 메서드가 있지만 VIP 구현 내용은 다름, 이럴 경우 상송 사용

}
