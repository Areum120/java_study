package typeInheritance;

public class MyClass implements MyInterface{

    @Override
    public void myMethod() {//인터페이스에서 상속받은 메서드 구현
        System.out.println("myMethod()");
    }

    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }
}
