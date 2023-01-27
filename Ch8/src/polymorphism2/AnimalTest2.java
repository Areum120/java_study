package polymorphism2;
import java.util.ArrayList;

class Animal2 {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human2 extends Animal2 {

    public void move() {
        System.out.println("사람이 두 발로 걷습니다. ");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다. ");
    }
}

class Tiger2 extends Animal2 {
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle2 extends Animal2 {
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}


    public class AnimalTest2 {
        ArrayList<Animal2> aniList = new ArrayList<Animal2>();//배열의 자료형은 Animal로 저장

        public static void main(String[] args) {
            AnimalTest2 aTest = new AnimalTest2();

            aTest.addAnimal();//Animal 추가
            System.out.println("원래 형으로 다운 캐스팅");
            aTest.testCasting();
        }

        public void addAnimal() {

            aniList.add(new Human2());//ArrayList에 추가되면서 Animal형으로 형 변환
            aniList.add(new Tiger2());
            aniList.add(new Eagle2());

            for (Animal2 ani : aniList) {//배열 요소를 Animal형으로 꺼내서 move()를 호출하면 재정의된 함수가 호출됨
                ani.move();
            }

        }

        public void testCasting(){
            for(int i=0; i<aniList.size(); i++){//모든 배열 요소를 하나씩 돌면서
                Animal2 ani = aniList.get(i);//Animal형으로 가져옴
                if(ani instanceof Human2){//Human2이면
                    Human2 h = (Human2)ani;//Human2로 다운캐스팅
                    h.readBook();
                }
                else if(ani instanceof Tiger2){
                    Tiger2 t = (Tiger2)ani;
                    t.hunting();
                }
                else if(ani instanceof Eagle2){
                    Eagle2 e = (Eagle2)ani;
                    e.flying();//각각 클래스의 move 외 함수가 호출되기 위해서는 다운캐스팅이 후 호출됨.
                }
                System.out.println("지원되지 않는 형입니다.");
            }
        }

    }
