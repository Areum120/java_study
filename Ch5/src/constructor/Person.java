package constructor;

public class Person {//Person 클래스는 생성자가 없어보이지만 자바 컴파일러에서 자동으로 만들어줌, 디폴트 생성자라고 함, 매개변수와 구현코드가 없음

    String name;
    float height;
    float weight;

//    public Person(){}

//    public Person(String pname){
//        name=pname;}//PersonTest에서 오류난 이유, 디폴트 생성자가 없기 때문, 즉 생성자가 하나도 없는 경우에만 디폴트 생성자 제공함
//        //오류를 해결하려먼 디폴트 생성자를 생성하거나, 매개변수 있는 생성자를 호출해야함.
        //생성자가 2개 이상 있는 경우 생성자 오버로드라고 함

//    왜 name이 아닌 pname으로 받았을까?

}
