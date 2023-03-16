package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //생성자, 멤버변수. 메서드 정보를 다 알 수 있음


        Class strClass = Class.forName("java.lang.String");//클래스 이름으로 가져오기, 정적 메서드로 클래스 생성하지 않아도 됨.

        Constructor[ ] cons = strClass.getConstructors();
        for(Constructor c: cons) {//모든 생성자 가져오기
            System.out.println(c);
        }

        System.out.println();
        Field[] fields = strClass.getFields();//모든 멤버변수 가져오기
        for(Field f: fields){
            System.out.println(f);
        }

        System.out.println();
        Method[] methods = strClass.getMethods(); //모든 메서드 가져오기
        for(Method m : methods){
            System.out.println(m);
        }
    }
}
