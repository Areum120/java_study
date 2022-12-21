package constructor;

//경우에 따라 일부러 디폴트 생성자 제공안하기도 함
public class Student {
    int studentID;
    String name;
    float height;
    float weight;

    //항상 학번을 사용하여 Student클래스 생성, 학생이 생성될 때 학번이 꼭 필요하기 때문에 디폴트 생성자 작성x
//    public Student(int studentID){//학번을 매개변수로 받음
//        this.studentID = studentID;//this는 생성된 인스턴스 스스로를 가리키는 예약어
//    }
    public Student(){

    }

    public Student(String pname, float pheight, float pweight){//같은 자료형은 같은 생성자를 만들어야 하나?
        name = pname;
        height = pheight;
        weight = pweight;
    }

}
