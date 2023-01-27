package inheritance;
//Customer 클래스 상속 받고 필요한 추가 속성과 기능을 사용할 수 있음
//나머지 추가 기능 구현

public class VIPCustomer2 extends Customer {

    //VIP고객 관련 기능 멤버 변수
    private int agentID; //VIP고객 담당 상담원 아이디
    double saleRatio;

//    public VIPCustomer2(){//오류 표시, 묵시적으로 호출될 디폴트 생성자 Customer()가 정의되지 않았으므로 다른 생성자 호출해야 한다고 함
//        customerGrade = "VIP";//고객 등급
//        bonusRatio = 0.05;//보너스 적립 5%
//        saleRatio = 0.1;//할인율 10%
//        System.out.println("VIPCustomer() 생성자 호출");//하위 클래스 생성할 때 콘솔 출력문
//    }

    public VIPCustomer2(int customerID, String customerName, int agentID){//상위 클래스에 디폴트 생서자가 없고 매개변수가 있는 생성자만 있을 경우 super(_로
        //매개변수 추가해서 매개변수가 있는 상위 클래스의 생성자를 직접 호출해야함.
        super(customerID, customerName); //상위 클래스 생성자 호출
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        System.out.println("VIPCustomer(int, String, int) 생성자 호출");
    }

    //메서드 재정의
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;//보너스 포인트 적립
        return price - (int)(price * saleRatio); //할인된 가격을 계산하여 반환, 재정의
    }

    public int getAgentID(){
        return agentID; //VIP고객에게만 필요한 메서드
    }

    //상위 클래스의 showCustomerInfo 메서드 참조해 담당 상담원 아이디 추가로 출력하려고 할 때
    public String showCustomerInfo(){
        return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID + "입니다.";
    }



    //Customer 클래스와 겹치는 멤버 변수와 메서드가 있지만 VIP 구현 내용은 다름, 이럴 경우 상속 사용

}
