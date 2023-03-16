package object;

import java.util.Objects;

class MyDate {

    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //equals 메서드 재정의


    @Override
    public boolean equals(Object o) {
        if (o instanceof MyDate){
            MyDate md = (MyDate) o;
            if(this.year==md.year && this.month ==md.month && this.day==md.day)
                return true;
            else return false;
        }
        return false;
        }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}


public class MyDateTest {
    public static void main(String[] args) {

        MyDate date1 = new MyDate(9, 18, 2004);
        MyDate date2 = new MyDate(9, 18, 2004);
        System.out.println(date1.equals(date2));//출력결과 값이 true가 되도록

    }
}
