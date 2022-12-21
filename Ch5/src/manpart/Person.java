package manpart;

public class Person {
    //멤버변수
    int age;
    String name;
    boolean ismarried;
    int childnumber;

    //메서드 생성
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public boolean getIsmarried(){
        return ismarried;
    }

    public int getChildnumber(){
        return childnumber;
    }


    public static void main(String[] args) {
        //인스턴스 생성하여 참조변수에 대입
        Person jamesName = new Person();
        jamesName.name = "James";

        Person jamesage = new Person();
        jamesage.age = 40;

        Person jamesIsmarried = new Person();
        jamesIsmarried.ismarried = true;

        Person jamesChildnumber = new Person();
        jamesChildnumber.childnumber = 3;

        System.out.println(jamesName.getName());
        System.out.println(jamesage.getAge());
        System.out.println(jamesIsmarried.getIsmarried());
        System.out.println(jamesChildnumber.getChildnumber());

    }

}
