package exerciseQ5;

public class StarCoffee {

    int money;

    public String brewing(int money){
        this.money += money;
        if (money == Menu.STARAMERICANO){//그냥 클래스를 갖다 써도 되는구만
            return "아메리카노는 4000원입니다.";//Strin brewing으로 해줘야 함
        }
        else if(money == Menu.STARLATTE) {
            return "라떼는 4500원입니다.";
        }
        else{
            return null;
        }

    }

}
