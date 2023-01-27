package inheritance;

public class OverridingTest2 {
    public static void main(String[] args) {
        Customer vc = new VIPCustomer2(10030, "나몰라", 2000); //VIP 고객 생성
        vc.bonusPoint = 1000;

        System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원입니다.");
//        Customer 클래스의 calcPrice를 호출한 것이 아닌, VIP2클래스를 호출함
//    상위 클래스와 하위 클래스에 같은 이름 메서드가 존재할 때 호출되는 메서드는 선언한 클래스형이 아닌,
//    생성된 인스턴스의 메서드를 호출, 즉 가상 메서드라고 함
    }
}
