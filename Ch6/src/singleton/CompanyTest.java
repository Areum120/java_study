package singleton;

public class CompanyTest {
    public static void main(String[] args) {
        Company myCompany1 = Company.getInstance();
        Company myCompany2 = Company.getInstance();//클래스 이름으로 getInstance()호출하여 참조 변수에 대입
        System.out.println(myCompany1==myCompany2);//두 변수가 같은 변수인지 확인
        //같은 참조값 true 확인
    }
}