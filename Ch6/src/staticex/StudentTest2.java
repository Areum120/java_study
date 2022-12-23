package staticex;

public class StudentTest2 {

    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.serialNum);//SerialNum 변수 초깃값 출력
        System.out.println(studentLee.studentName + "학번:" + studentLee.studentID);//이지원학생 학번 출력


        Student studentSon = new Student();
        studentSon.setStudentName("손수경");
        System.out.println(studentSon.serialNum);
        System.out.println(studentSon.studentName + "학번: "+ studentSon.studentID);//학번 출력


    }
}
