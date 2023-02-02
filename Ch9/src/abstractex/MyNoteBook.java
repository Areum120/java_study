package abstractex;

public class MyNoteBook extends NoteBook{
    @Override
    public void typing() {
        System.out.println("MyNoteBook typing");//모든 추상 메서드가 구현된 클래스므로 abstract 예약어를 사용하지 않음
    }
}
