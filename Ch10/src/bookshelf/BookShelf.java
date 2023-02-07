package bookshelf;

//인터페이스 구현과, 상속 동시 가능
public class BookShelf extends Shelf implements Queue {
    @Override
    public void enQueue(String title) {//배열에 요소 추가
        shelf.add(title);//상속받았기 때문에 부모클래스 멤버변수 사용 가능
    }

    @Override
    public String deQueue() {//맨 처음 요소를 배열에서 삭제하고 반환
        return shelf.remove(0);
    }

    @Override
    public int getSize() {//배열 요소 반환
        return getCount();
    }
}
