package inheritance;

public class OverridingTest3 {
    public static void main(String[] args) {
     int price = 10000;

     Customer customerLee = new Customer(10010, "이순신");
     System.out.println(customerLee.getCustomerName()+ " 님이 지불해야 하는 금액은" + customerLee.calcPrice(price) + "원입니다.");

     VIPCustomer2 customerKim = new VIPCustomer2(10020, "김유신", 12345);
     System.out.println(customerKim.getCustomerName()+ " 님이 지불해야 하는 금액은" + customerKim.calcPrice(price) + "원입니다.");

     Customer vc = new VIPCustomer2(10030, "이아름", 2000);
     System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은" + vc.calcPrice(10000) + "원입니다.");
    //Customer형으로 형변환되는 게 맞지만 가상 메서드 방식에 의해 VIPCustomer 인스턴스의 메서드가 호출되어 할인된 9000원이 출력됨
    //가상메서드는 일반메서드와 달리 재정의를 함으로써 주소가 달라짐
    //재정의는 가상 메서드가 만들어짐, 재정의 안된 경우 상위 클래스의 Customer클래스 calcPrice()메서드가 호출됨

    }
}
