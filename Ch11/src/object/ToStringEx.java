package object;


class Book{
    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle){
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

//    toString메서드 재정의: 객체의 참조변수를 이용해 원하는 문자열 표현할 수 있음.
    @Override
    public String toString() {
        return bookTitle + "," + bookNumber;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book1 = new Book(200, "개미");

        //재정의 안할 시
//        System.out.println(book1);//인스턴스 정보(클래스 이름, 주소 값)
//        System.out.println(book1.toString());//toString()메서드로 인스턴스 정보(클래스 이름, 주소 값)을 보여줌

        //toString 재정의 시
        System.out.println(book1);
        System.out.println(book1.toString());


        //원형이 아닌 String과 integer 클래스는 재정의된 toString 출력
        String str = new String("test");
        System.out.println(str);

        Integer i1 = new Integer(100);
        System.out.println(i1);

    }

}
