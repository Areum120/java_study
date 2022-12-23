package staticex;

public class Student2 {
    private static int serialNum = 1000;//private으로 변경
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student2(){
        serialNum ++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public static int getSerialNum(){//serialNum의 get메서드, 클래스 메서드, 외부에서 값 사용
        //클래스 메서드 내부에서는 멤버 변수(인스턴스 변수) 사용x, 인스턴스가 생성될 때 만들어지는 인스턴스 변수이므로
        //studentName = "이지원";
        int i = 10;//메서드 내부에서 선언한 변수, 이 지역에서만 사용하여 지역 변수
        return serialNum;//static 변수는 클래스 메서드 내부에서 사용 가능
    }

    public static void setSerialNum(int serialNum){//값 변경하려면 사용
        Student2.serialNum = serialNum;
    }

}
