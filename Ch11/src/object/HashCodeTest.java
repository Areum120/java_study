package object;

public class HashCodeTest {
    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.hashCode());//hash 코드 값 출력
        System.out.println(str2.hashCode());//hash 코드 값 출력

        Integer i1 = new Integer(100);//동일한 hash코드 값 반환
        Integer i2 = new Integer(100);

        System.out.println(i1.hashCode());//정수 값 반환
        System.out.println(i2.hashCode());






    }
}
