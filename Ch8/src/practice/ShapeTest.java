package practice;

import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {

        ArrayList<Shape> list = new ArrayList<Shape>();

        list.add(new Circle());
        list.add(new Triangle());
        list.add(new Shape());

        for(Shape s : list){
            s.draw();//공통된 함수 호출하기 
        }

    }
}
