package exerciseQ5;

public class CoffeeTest {
    public static void main(String[] args) {

        //손님 생성
        Customer customerKim = new Customer("김수연", 10000);
        Customer customerLee = new Customer("이아름", 20000);

        //별다방 주문번호 생성
        StarCoffee star1 = new StarCoffee();//디폴트 생성자가 있어서 따로 생성자 안만들고 그냥 생성해도 되는구만
        //콩다방 주문번호 생성
        BeanCoffee bean1 = new BeanCoffee();

        //김씨는 4000원 내고 별다망에서 아메리카노를 마심
        customerKim.buyStarCoffee(star1, 4000);

        //이씨는 4500원을 내고 콩다방에서 라떼를 마심
        customerLee.buyBeanCoffee(bean1, 4500);

    }


}
