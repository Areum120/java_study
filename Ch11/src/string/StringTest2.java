package string;

public class StringTest2 {
    public static void main(String[] args) {

        //한번 문자열 선언하면 final로 선언되어 변경되지 않음
        String javaStr = new String("java");
        String androidStr = new String("android");

        System.out.println(javaStr);
        System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));

        //두개의 문자열을 연결할 경우 변경이 아닌 새로운 문자열 생성됨

        javaStr = javaStr.concat(androidStr);//두 문자열을 concat으로 연결하여 eodlq

        System.out.println(javaStr);
        System.out.println("연결된 문자열 주소 값: " + System.identityHashCode(javaStr));//새로운 주소값이 생성됨






    }
}
