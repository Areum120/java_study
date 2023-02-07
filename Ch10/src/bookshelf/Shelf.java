package bookshelf;
import java.util.ArrayList;

public class Shelf {
//    ArrayList 자료형 선언
    protected ArrayList<String> shelf;

    public Shelf(){
        shelf = new ArrayList<String>();//디폴트 생성자로 Shelf 클래스를 생성하면 ArrayList도 생성됨
    }

    public ArrayList<String> getShelf(){
        return shelf;//ArrayList값 가져오기
    }

    public int getCount(){
        return shelf.size();
    }


}
