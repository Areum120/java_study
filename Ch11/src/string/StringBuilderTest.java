package string;


//문자열을 계속 변경하거나 연결하면 메모리 낭비됨
//StringBuilder, StringBuffer를 사용하면 추가 메모리 사용안함
//StringBuffer 클래스는 문자열이 안전하게 변경되도록 보장하지만 StringBuilder클래스는 보장되지 않으나 실행속도가 빠름


public class StringBuilderTest {
    public static void main(String[] args) {

        String javaStr = new String("Java");
        System.out.println("javaStr 문자열 주소: " + System.identityHashCode(javaStr));

        StringBuilder buffer = new StringBuilder(javaStr);
        System.out.println("연산 전 Buffer 메모리 주소 : " + System.identityHashCode(buffer));

        //문자열 추가
        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programming is fun!!");
        System.out.println("연산 후 buffer 메모리 주소: "+ System.identityHashCode(buffer));

        //String 클래스로 반환
        javaStr = buffer.toString();
        System.out.println(javaStr);
        System.out.println("연결된 javaStr 문자열 주소: " + System.identityHashCode(javaStr));

    }
}
