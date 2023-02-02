package abstractex;

public class ComputerTest {
    public static void main(String[] args) {
//        Computer c1 = new Computer();//형변환은 가능하나 추상클래스는 구현된 코드가 없으므로 인스턴스로 만들 수 없음
        Computer c2 = new DeskTop();
//        Computer c3 = new NoteBook();
        Computer c4 = new MyNoteBook();

    }
}
