package exerciseQ5;

public class Customer {

    public String name;
    public int money;

    public Customer(String name, int money){
        this.name = name;
        this.money = money;//처음 고객의 돈이 들어감
    }

    public void buyStarCoffee(StarCoffee star, int money){
        String message = star.brewing(4000);//4000원 내기
        this.money -=money;//돈차감
        if(message!=null){//만약 메세지가 널이 아니면
            System.out.println(name + "고객의 남은 돈은"+ this.money +"입니다.");
        }
    }
    public void buyBeanCoffee(BeanCoffee bean, int money){
        String message = bean.brewing(4500);
        this.money -=money;
        if(message!=null){//만약 메세지가 널이 아니면
            System.out.println(name + "고객의 남은 돈은"+ this.money +"입니다.");
        }
    }



}
