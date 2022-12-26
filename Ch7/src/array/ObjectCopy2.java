package array;

public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");//인스턴스 자체가 아닌 인스턴스 주소값 저장
        bookArray1[1] = new Book("데미안", "헤르만헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
        //배열 복사
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        for(int i= 0; i<bookArray2.length; i++){
            bookArray2[i].showBookInfo();
        }

        //배열 첫번째 요소값 변경
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        System.out.println("=== bookArray1 ===");
        for(int i=0; i< bookArray1.length; i++){
            bookArray1[i].showBookInfo();//값 변경되어 출력
        }
        System.out.println("=== bookArray2 ===");
        for(int i=0; i< bookArray2.length; i++){//bookarray2도 변경되어 출력
            bookArray2[i].showBookInfo();
        }
        //인스턴스 주소값만 복사하므로 얕은 복사,
        // 두 배열이 같은 인스턴스를 가리키고 있으므로 인스턴스 값이 변경되면 두 배열 모두 영향 끼침
    }

}
