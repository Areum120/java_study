package thisex;

class Person {
    int age;
    String name;

    Person(){
        this("이름없음",1);
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    Person returnItSelf(){//반환형을 클래스형, this 반환
        return this;
    }

}


public class CallAnotherCont {
    public static void main(String[] args) {
        Person noName = new Person();
        System.out.println(noName.name);
        System.out.println(noName.age);

        Person p = noName.returnItSelf();//this 값을 클래스 변수에 기입
        System.out.println(p);//noName.returnItSelf()의 반환값 출력
        System.out.println(noName);//참조변수 출력

    }
}
