package cooperation;
//학생이 학교에 가는 과정 수행
public class Student {

    public String studentName;//이름
    public int grade;//학년
    public int money;//학생이 가지고 있는 돈

    //학생 이름과 돈을 매개변수로 갖는 생성자, 학생 클래스를 생성하려면 호출, 학생 클래스를 생성하면 학생 이름과 학생이 가진 돈을 초기화, 디폴트 생성자 제공 안함
    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }
    //학생이 버스를 타면 1000원을 지불하는 메서드
    public void takeBus(Bus bus){//Bus 클래스를 파라미터 bus로 받아서 take 메서드 기능 이용
        bus.take(1000);
        this.money -=1000;
    }
    //학생이 지하철을 타면 1500원을 지불하는 메서드
    public void takeSubway(Subway subway){//Subway 클래스를 파라미터 subway로 받아서 take 메서드 기능 이용
        subway.take(1500);
        this.money -= 1500;
    }

    //학생이 택시를 타면 10000원을 지불하는 메서드
    public void takeTaxi(Taxi taxi){
        taxi.take(10000);
        this.money -= 10000;
    }

    //학생이 갖고 있는 돈 출력
    public void showInfo(){
        System.out.println(studentName+"님의 남은 돈은"+money+"입니다.");
    }
}
