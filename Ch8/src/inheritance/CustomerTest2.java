package inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        VIPCustomer2 customerKim = new VIPCustomer2(10020,"김유신", 12222);
//        customerKim.setCustomerID(10020);
//        customerKim.setCustomerName("김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

    }
}
