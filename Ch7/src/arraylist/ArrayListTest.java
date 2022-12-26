package arraylist;
import array.Book;

import java.util.ArrayList;


public class ArrayListTest {
    public static void main(String[] args) {
        //배열 길이가 바뀌거나, 배열 요소 위치가 바뀔 때 등 객체 배열을 쉽게 사용할 수 있도록 arraylist를 쓰면 편함
        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤르만헤세"));
        library.add(new Book("어떻게 살 것인가", "유시민"));
        library.add(new Book("토지", "박경리"));
        library.add(new Book("어린왕자", "생택쥐페리"));

        for(int i=0; i<library.size(); i++){//배열에 추가된 요소 개수만큼만 출력 size() 저장된 요소 개수 반환
            Book book = library.get(i);
            book.showBookInfo();
        }
        System.out.println("===향상된 for문 사용===");
        for(Book book : library){
            book.showBookInfo();
        }




    }
}
