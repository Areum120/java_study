package inheritance;

public class Customer {
    protected int customerID;//고객 ID
    protected String customerName;//고객 이름
    protected String customerGrade;//고객 등급
    int bonusPoint;//보너스 포인트
    double bonusRatio;//적립 비율

    //디폴트 생성자
//    public Customer(){
//        customerGrade = "SILVER";//기본 등급
//        bonusRatio = 0.01; // 보너스 포인트 기본 적립 비율
//        System.out.println("Customer() 생성자 호출");//상위 클래스 생성할 때 콘솔 출력문
//    }

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer(int, String) 생성자 호출");

    }


    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;//보너스 포인트 계산
        return price;
    }

    //protected로 선언한 변수를 사용하기 위해 get, set 메서드 추가
    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String showCustomerInfo(){//고객 정보 반환
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";

    }


}
