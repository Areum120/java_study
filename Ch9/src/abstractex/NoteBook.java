package abstractex;

public abstract class NoteBook extends Computer{//추상메서드 하나가지고 있어 추상 클래스가 됨
    @Override
    public void display() {
        System.out.println("NoteBook display");//display하나만 구현
    }
}
