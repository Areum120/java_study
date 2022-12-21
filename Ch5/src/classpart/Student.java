package classpart;

public class Student {//멤버변수를 이용하여 클래스 기능을 구현

    //멤버변수
    int studentID;
    String studentName;
    int grade;
    String address;

    //메서드 생성
    public String getStudentName(){
        return studentName;
    }

    public int getGrade(){
        return grade;
    }

    //메인함수 실행
    public static void main(String[] args){//string 타입으로 받음
        Student studentAhn = new Student();//인스턴스 생성(멤버변수를 저장할 공간 필요, 힙 메모리 생성)
        //생성된 인스턴스를 studentAhn 참조변수에 대입, studentAhn은 프로그램 내에서 사용되는 변수이므로 지역변수라고도 함, 스택메모리가 생성됨
        //스택 메모리에 생성된 힙 메모리의 주소를 대입하는 것임
        //힙은 동적 메모리 공간이고 사용이 끝나면 메모리를 해제해줘야함, C는 메모리를 해제해줘야 하는데 자바는 가비지 컬렉터가 자동으로 메모리 해제해줌

        studentAhn.studentName = "안연수";//studentAhn참조 변수에 student 멤버변수 데이터 저장
        studentAhn.grade = 3;

        Student studentKim = new Student();//두번째 인스턴스 생성
        //클래스가 생성될 때마다 인스턴스는 다른 메모리 공간 차지하여 매번 따로 생김
        //클래스에 선언한 멤버변수(studentName)를 인스턴스 변수라고 함
        studentKim.studentName = "김민수";//김민수는 참조값, 인스턴스마다 각기 다른 참조값을 가짐, 메모리 주소값=해시 코드 값이라고도 함(가상 주소값)




        //메서드 사용
        //System.out.println(studentAhn.studentName);//안연수 출력
        System.out.println(studentAhn.getStudentName());//안연수 출력
        System.out.println(studentKim.getStudentName());//김민수 출력
        System.out.println(studentAhn.getGrade());//3 출력


    }

}
