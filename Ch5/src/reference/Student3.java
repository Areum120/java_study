package reference;

public class Student3 {
    int studentID;
    String studentName;

    //참조자료형 사용, jdk에서 제공하는 것도 사용 가능
    Subject korean;
    Subject math;


//    public static void main(String[] args) {
//
//        Student3 studentpark = new Student3();
//        studentpark.korean.SubjectName = "국어";
//
//        System.out.println(studentpark.korean.getSubjectName());
        //Exception in thread "main" java.lang.NullPointerException 자신이 넘겨주려는 변수가 null(0)인데 그것이 아닌 것 처럼 사용하려고 해서 에러가 생긴 것
//      국어를 입력하려고 하지말고 그 자체 변수 뜻이 국어이므로 korean.SubjectName 변수를 사용할 것

    }
