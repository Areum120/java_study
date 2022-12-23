package staticex;

public class Student3 {

    public static int SerialNum = 1000;
    public int studentID;
    public int studentCardNum;
    public String studentName;

    public Student3(){//학생 생성될 때마다 학번 증가
        SerialNum++;
        studentID = SerialNum;//학번에 고유 번호 부여
        studentCardNum = studentID + 100;//학생카드번호는 학번에 100을 더한 값

    }

    public String getStudentName(){//이름값 가져오기
        return studentName;
    }

    public void setStudentName(String name){//이름 수정
        studentName = name;
    }

}
