package exerciseQ5;

public class BeanCoffee {

    int money;//커피가격

    public String brewing(int money){
        this.money+=money;
        if(money == Menu.BEANAMERICANO){//money 가격이 콩다방 메뉴의 아메리카노 가격과 같다면
            return "콩다방 아메리카노를 주문하셨습니다.";
        }
        else if(money== Menu.BEANLATTE){
            return "콩다방 라떼를 주문하셨습니다.";
        }
        else
            return null;
    }


}
