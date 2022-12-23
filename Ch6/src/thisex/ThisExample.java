package thisex;

//BirthDay라는 클래스와 ThisExample이라는 다른 클래스지만 메인메서드로 실행할 수 있음
class BirthDay {

    int day;
    int month;
    int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {//인자 파라미터로 받은 값을 BirthDay year 변수에 넣기
        this.year = year;

    }

    public void printThis(){
        System.out.println(this);
    }

}
public class ThisExample {
    public static void main(String[] args) {

        BirthDay bDay = new BirthDay();
        bDay.setYear(2000);
        System.out.println(bDay);//참조값
        bDay.printThis();//참조값
        System.out.println(bDay.year);//2000으로 넣은 값을 getyear메서드 생성해서 값 출력하기

    }
}


