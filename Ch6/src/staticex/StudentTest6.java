package staticex;

public class StudentTest6 {
    public static void main(String[] args) {

        Student3 studentLee = new Student3();
        studentLee.setStudentName("이아름");
        System.out.println(studentLee.studentName+ "의 학번은"+studentLee.studentID+"카드번호는 "+ studentLee.studentCardNum);


        Student3 studentKim = new Student3();
        studentKim.setStudentName("김경록");
        System.out.println(studentKim.studentName+ "의 학번은"+studentKim.studentID+"카드번호는 "+ studentKim.studentCardNum);

    }


}
