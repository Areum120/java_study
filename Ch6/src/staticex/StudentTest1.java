package staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.serialNum);//SerialNum 변수 초깃값 출력
        studentLee.serialNum ++;//학번 증가

        Student studentKim = new Student();
        studentKim.setStudentName("김수경");
        System.out.println(studentKim.serialNum);//학번 출력

        System.out.println(studentLee.serialNum);//이지원학생 학번 출력



    }
}
