package hiding;

//private를 쓰는 이유
public class myDate {
    private int day;
    private int month;
    private int year;

    //main에서 month가 2월일 때 day를 31일로 잘못 입력한 경우
    //디폴트 생성자 외 setDay 생성자로 public 메서드를 별도로 제공
    public void setDay(int day){
        if(month == 2){
            if(day < 1 || day > 28){
                System.out.println("오류입니다");
            } else {
                this.day = day;
            }
        }
    }
    //this를 왜 쓰는 걸까?
    //접근 제어자 연습하기까지 공부
}
