package bookshelf;

public class BookShelfTest {
    public static void main(String[] args) {
        //인스턴스 생성
        Queue shelfQueue = new BookShelf();
        //순서대로 요소를 추가
        shelfQueue.enQueue("태백산맥1");
        shelfQueue.enQueue("태백산맥2");
        shelfQueue.enQueue("태백산맥3");

        System.out.println(shelfQueue.deQueue());//입력 순서대로 요소 꺼내서 출력
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());




    }

}
