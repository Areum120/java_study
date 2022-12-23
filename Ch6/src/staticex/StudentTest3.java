package staticex;

public class StudentTest3 {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이지원");
        System.out.println(Student.serialNum);//인스턴스가 생성되지 않아도 사용할 수 있어 studentLee.serialNum이 아닌 클래스 이름으로 참조하여 사용
        System.out.println(studentLee.studentName);
        System.out.println(studentLee.studentName+"학번:"+studentLee.studentID);

        Student studentSon = new Student();
        studentSon.setStudentName("손수경");
        System.out.println(Student.serialNum);
        System.out.println(studentSon.studentName);
        System.out.println(studentSon.studentName+"학번:"+studentSon.studentID);


    }

}
