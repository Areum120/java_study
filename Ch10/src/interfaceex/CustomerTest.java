package interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();//Customer 클래스형 customer를 Buy 인터페이스형인 buyer에 대입하여 형변환, buyer는 Buy 인터페이스의 메서드만 호출 가능
        buyer.order();//재정의된 메서드 호출, Buy에서 구현한 디폴트메서드가 아닌 가상 메서드 원리로 Customer 클래스에서 정의한 메서드가 호출됨

        Sell seller = customer;
        seller.sell();
        seller.order();//재정의된 메서드 호출

        //다운캐스팅
        if(seller instanceof Customer){
            Customer customer2 = (Customer) seller; //seller를 하위 클래스형인 Customer로 다시 형변환
            customer2.buy();
            customer2.sell();
        }
        customer.order();//재정의된 디폴트 메서드 호출

    }
}
