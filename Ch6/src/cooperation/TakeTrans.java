package cooperation;

public class TakeTrans {
    //학생이 버스나 지하철 탔을 때 상황 구현, 메인 메서드로 구현하기
    public static void main(String[] args) {
        //James와 Tomas
        Student studentJames = new Student("James", 5000);//이름과 돈 받기
        Student studentTomas = new Student("Tomas", 10000);
        //Edward 학생이 택시 타기
        Student studentEdward = new Student("Edward", 20000);


        //100번 버스 생성
        Bus bus100 = new Bus(100);
        //bus100.take(1000);//안써도 됨, 2번 실행되는 효과 생김
        studentJames.takeBus(bus100);//James가 버스를 탐
        studentJames.showInfo();//James 정보 확인
        bus100.showInfo();//100번 버스 정보 확인

        //2호선 지하철 생성
        Subway subwayGreen = new Subway(2);
        //subwayGreen.take(1500);//안써도 됨, 2번 실행되는 효과 생김
        studentTomas.takeSubway(subwayGreen);//James가 버스를 탐
        studentTomas.showInfo();//학생 남은 돈 확인
        subwayGreen.showinfo();//지하철 남은 정보 확인

        //의문점 : take를 호출하지 않았는데 자동으로 실행되는 걸까?
        //답변: staticex.Student 클래스의 takeBus, takeSubway에 각각 bus.take(), subway.take()로 호출 실행함, 굳이 메인메서드에 실행 안해도 됨.

        //택시타기
        Taxi taxi1 = new Taxi(1544);
        studentEdward.takeTaxi(taxi1);//Edward가 taxi 탐
        studentEdward.showInfo();
        taxi1.showinfo();


    }

}
