package arraylist;

public class StudentTest {
    public static void main(String[] args) {
        //학생 생성
        Student studentLee = new Student(1001, "Lee");
        //과목, 점수 생성
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("국어", 70);
        studentKim.addSubject("수학", 85);
        studentKim.addSubject("영어", 100);

        //출력
        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

    }

}
