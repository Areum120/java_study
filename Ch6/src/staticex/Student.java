package staticex;

public class Student {//static 변수는 이탤릭체로 사용
    public static int serialNum = 1000;//static변수는 클래스 변수라고 하며 인스턴스 생성 상관없이 먼저 생성되고 모든 인스턴스가 값 공유
    //클래스 전반에 공통으로 사용하는 기준 변수
    public int studentID;//학번 따로 static 변수 따로 생성, static 변수를 바로 변수로 사용할 경우 모든 인스턴스가 공유하는 변수로 동일한 학번값을 가지게 됨
    public String studentName;
    public int grade;
    public String address;


    //학생 생성될 때마다 학번 증가하는 생성자
    public Student(){
        serialNum++;//학생 생성될때마다 증가
        studentID = serialNum;//학번에 번호 부여


    }



    public String getStudentName(){
        return studentName;//학생 이름 가져오기
    }
    public void setStudentName(String name){//studentName을 입력값으로 받는 메서드
        studentName = name;
    }

}
