//package thisex;
//
//class Person{
//    String name;
//    int age;
//
//    //Person이라는 동일한 클래스 이름을 여러개 생성할 수 있음
//    Person(){//this를 사용해 Person(String, int)생성자 호출, 디폴트 생성자
//        //this.name = name;//클래스가 생성될때 생성자 호출되므로 생성 완료되지 않은 시점에 다른 코드 있으면 오류 발생
//
//        this("이름 없음", 1);//set,get없이 호출
//        }
//
//    Person(String name, int age){//매개변수를 가진 생성자
//
//        this.name = name;
//        this.age = age;
//    }
//
//}
//
//public class CallAnotherConst {
//    public static void main(String[] args) {
//        Person noName = new Person();
//        System.out.println(noName.age);
//        System.out.println(noName.name);
//
//    }
//
//}
