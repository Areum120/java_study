package object;

class Student{
    String studentName;
    int studentNum;

    Student(String studentName, int studentNum){
        this.studentName = studentName;
        this.studentNum = studentNum;
    }

    @Override
    public String toString() {
        return studentName+"의 학번은"+studentNum+"입니다.";
    }
}

public class ToStringEx2 {
    public static void main(String[] args) {
        Student studentLee = new Student("이아름", 10090);
        System.out.println(studentLee.toString());

    }
}
