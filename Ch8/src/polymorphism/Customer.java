package polymorphism;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    public int bonusPoint;
    public double bonusRatio;

    public Customer(){
        initCustomer();//고객 등급, 보너스 포인트 적립률 지정함수 호출
    }

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        initCustomer();//고객 등급, 보너스 포인트 적립률 지정함수 호출
    }

    private void initCustomer(){//생성자에서만 호출하는 함수로 private 선언
        customerGrade = "SILVER";//멤버변수 초기화
        bonusRatio = 0.01;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
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

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
}
