package constructor;

public class StudentTest {

    public static void main(String[] args) {
        //디폴트 생성자는 인스턴스를 생성한 후 인스턴스 변수 값을 따로 초기화
//        Student studentkim = new Student();
//        studentkim.name = "김유신";

        //매개변수가 있는 생성자를 사용하면 생성자 내부에서 변수를 초기화할 수 있도록 구현하므로 코드가 간결
        Student studentKim = new Student("김유신", 180, 75);

    }


}
