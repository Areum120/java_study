package polymorphism;


public class AnamalTest1 {
    public static void main(String[] args) {
        AnamalTest1 aTest = new AnamalTest1();
        aTest.moveAnimal(new Human());
        aTest.moveAnimal(new Tiger());
        aTest.moveAnimal(new Eagle());
    }

    //어떤 메서드가 넘어와도 모두 Animal형으로 변환함
    public void moveAnimal(polymorphism.Animal animal){//매개변수의 자료형이 상위 클래스
        animal.move();//재정의된 메서드가 호출됨
        //Animal ani = new Human();
        //가상 메서드에 따라 오버라이딩처럼 재정의가 된 메서드가 호출되므로 넘어온 실제 인스턴스의 메서드가 호출됨
        //animal.move() 코드는 변함없지만 어떤 매개변수가 넘어왔느냐에 따라 출력문이 달라짐
        //어떤 클래스가 추가되더라도 Animal 자료형 하나로 쉽게 관리할 수 있어 다형성을 활용한 프로그램의 확장성임
        //유지보수에 좋음
    }

}

