package object;

import java.util.Objects;

class Student2{
    int studentId;
    String studentName;

    public Student2(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentId + "," + studentName;
    }

//    equals 메서드 재정의
    @Override
    public boolean equals(Object obj) {//비교될 객체가 Object형 매개변수로 전달되면(논리적으로 같을 경우)
        if (obj instanceof Student2){//다운캐스팅으로 매개변수 원래 자료형이 Student인지 확인
            Student2 std = (Student2)obj;
            if(this.studentId == std.studentId)//학생의 학번이 같으면 true 반환
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {//같은 해시코드 값 반환
        return studentId;
    }
}



public class EqualsTest {
    public static void main(String[] args) {
        Student2 studentLee = new Student2(100, "이상원");

        Student2 studentLee2 = studentLee;//주소 복사
        Student2 studentSang = new Student2(100, "이상원");

//    동일한 주소의 두 인스턴스 비교

        if(studentLee == studentLee2)//기호로 비교
            System.out.println("studentLee와 studentLee2의 주소는 같습니다. ");
        else
            System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");

        if(studentLee.equals(studentLee2))//equals로 비교
            System.out.println("stuentLee와 studentLee2는 동일합니다.");
        else
            System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");


//        동일인이지만 인스턴스 주소가 다른 경우


//        물리적으로 두 학생의 인스턴스 주소는 다르지만, 논리적 정보는 같다.
        if(studentLee == studentSang)//기호로 비교
            System.out.println("studentLee와 studentSang의 주소는 같습니다. ");
        else
            System.out.println("studentLee와 studentSang의 주소는 다릅니다.");

        if(studentLee.equals(studentSang))//equals로 비교
            System.out.println("stuentLee와 studentSang은 동일합니다.");
        else
            System.out.println("studentLee와 studentSang은 동일하지 않습니다.");

// 해시코드 값 반환
        System.out.println("studentLee의 hashCode: "+ studentLee.hashCode());
        System.out.println("studentSang의 hashCode: "+ studentSang.hashCode());

        System.out.println("studentLee의 실제 주소값: "+ System.identityHashCode(studentLee));
        System.out.println("studentSang의 실제 주소값: "+ System.identityHashCode(studentSang));

    }
}
