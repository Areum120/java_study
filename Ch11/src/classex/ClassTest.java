package classex;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException {//forName()메서드에서 발생하는 예외를 처리함

        Person person = new Person();
        Class pClass1 = person.getClass();//Object의 getClass() 메서드 사용하기
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class;//직접 class 파일 대입하기
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("classex.Person");//클래스 이름으로 가져오기
        System.out.println(pClass3.getName());

        //클래스 활용하여 정보를 가져오고 이 정보를 활용하여 인스턴스를 생성하거나 메서드를 호출하는 방식을 리플렉션이라고 합니다.


    }

}
