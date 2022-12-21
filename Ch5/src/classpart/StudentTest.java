package classpart;

//외부에 메인함수 실행
public class StudentTest {

    public static void main(String[] args) {

        //new Student()는 생성된 클래스이므로 인스턴스라고 함, 메모리공간(힙 메모리) 할당받음
        Student studentThird = new Student();//new예약어를 통한 생성자(constructor) 입력
        //참조 변수=지역 변수
        studentThird.grade = 3;

        System.out.println(studentThird.getGrade());

    }

}

