package inheritance;

public class TypeConv {
    public static void main(String[] args) {
        //하위 클래스는 상위 클래스 자료형으로 형변환할 수 있지만 역은 안됨
        Customer vc = new VIPCustomer2(1001, "김경록", 2003);//vc는 Customer 멤버만 가리킬 수 있음
        //클래스 상속 계층이 여러 단계일 경우 상위 클래스로의 형변환은 묵시적으로 이루어짐


    }
}
