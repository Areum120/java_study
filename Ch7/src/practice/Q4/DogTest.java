package practice.Q4;

public class DogTest {
    public static void main(String[] args) {
        //DogTest 클래스와 배열 길이가 5인 Dog[] 배열 만든 후 Dog 인스턴스를 5개 생성하여 배열에 추가
        //for문과 향상된 for문에서 Dog 클래스의 showDogInfo() 메서드를 사용해서 배열에 추가한 Dog정보를 모두 출력하세요.

        Dog[] dog = new Dog[5];//길이 5인 배열 생성

        //인스턴스 5개 생성해서 배열 추가
        dog[0] = new Dog("예삐", "요크셔테리어");
        dog[1] = new Dog("소리", "래브라도리트리버");
        dog[2] = new Dog("꽁이", "포메라니언");
        dog[3] = new Dog("미래", "말티즈");
        dog[4] = new Dog("희망이", "페키니즈");

        //for문에서 Dog정보 출력
        for(int i=0; i<dog.length; i++){
            System.out.println(dog[i].showDogInfo());
        }
        System.out.println("향상된 for문");
        //향상된 for문에서 Dog 정보 출력
        for(Dog dogInfo:dog){
            System.out.println(dogInfo.showDogInfo());
        }


    }
}
