package classex;


//반환되는 클래스 자료형이 어떤건지 모를 때 클래스 정보 찾기
public class Person {

    private String name;
    private int age;

    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }




}
