package shoppingmall;
import manpart.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Order {

    //멤버변수
    String orderNum;
    String orderID;
    //날짜
    LocalDate orderDate;
    String orderName;
    String orderProductNum;
    String adress;


    //메서드
    public String getOrderNum(){
        return orderNum;
    }
    public String getOrderID(){
        return orderID;
    }
    public LocalDate getOrderDate(){return orderDate;
    }
    public String getOrderName(){
        return orderName;
    }
    public String getOrderProductNum(){
        return orderProductNum;
    }
    public String getAdress(){
        return adress;
    }
    public static void main(String[] args) {
        //인스턴스 참조변수 입력
        //주문번호
        Order orderNumber = new Order();
        orderNumber.orderNum = "201803120001";
        //주문아이디
        Order orderPersonID = new Order();
        orderPersonID.orderID = "abc123";
        //주문날짜
        Order orderDate1 = new Order();
        orderDate1.orderDate = LocalDate.of(2018,3,12);

        //주문자이름
        Order orderName1 = new Order();
        orderName1.orderName = "홍길순";
        //주문상품번호
        Order orderProductNum1 = new Order();
        orderProductNum1.orderProductNum = "PD0345-12";
        //배송주소
        Order orderAdress1 = new Order();
        orderAdress1.adress = "서울시 영등포구 여의도동 20번지";

        //출력
        System.out.println(orderNumber.getOrderNum());
        System.out.println(orderPersonID.getOrderID());
        System.out.println(orderDate1.getOrderDate().getYear()+"년"+orderDate1.getOrderDate().getMonthValue()+"월"+orderDate1.getOrderDate().getDayOfMonth()+"일");
        System.out.println(orderName1.getOrderName());
        System.out.println(orderProductNum1.getOrderProductNum());
        System.out.println(orderAdress1.getAdress());

    }


}
