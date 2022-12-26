package array;

public class BookArray2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];//Book클래스형으로 객체 배열 생성
        library[0] = new Book("태백산맥", "조정래");//array.Book 인스턴스를 만들어 직접 배열 각 요소에 저장
        library[1] = new Book("데미안", "헤르만헤세");
        library[2] = new Book("어떻게 살 것인가", "유시민");
        library[3] = new Book("토지", "박경리");
        library[4] = new Book("어린왕자", "생땍쥐베리");

        for(int i =0; i<library.length; i++){
            library[i].showBookInfo();//array.Book 인스턴스 멤버들
        }
        for(int i=0; i<library.length; i++){
            System.out.println(library[i]);//Book인스턴스를 저장한 메모리 공간주소
        }


    }
}
