package typeInheritance;

public class MyClassTest {
    public static void main(String[] args) {

        MyClass mClass = new MyClass();

//        상위 인터페이스로 대입
        X xClss = mClass;
        xClss.x();//X에 선언한 메서드만 호출 가능

        Y yClass = mClass;
        yClass.y();//Y에 선언한 메서드만 호출 가능

//        구현한 인터페이스형 변수에 대입시 상속한 모든 메서드 호출 가능
        MyInterface iClass = mClass;
        iClass.myMethod();
        iClass.x();
        iClass.y();


    }
}
