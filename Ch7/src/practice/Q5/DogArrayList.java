package practice.Q5;

import java.util.ArrayList;

public class DogArrayList {

    private String name;
    private String type;
    ArrayList<String> dogNameList;//자료형 넣기

    public DogArrayList(){

    }

    public DogArrayList(String name, String type){
        this.name = name;
        this.type = type;

    }

//    //dogname을 배열에 저장하는 메서드
//    public void addDogName(String name, String type) {
//        dogNameList = new ArrayList<String>();//arraylist 인스턴스 생성
//        dogNameList.add(name);
//        dogNameList.add(type);
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dogShowInfo() {
            System.out.println(name+"은(는) "+type+"입니다.");
        }

//        for (int i = 0; i < dogNameList.size(); i++) {
//            System.out.println(dogNameList.get(i) + "입니다.");
//        }


}