package practice.Q5;

import array.Book;

import java.util.ArrayList;

public class DogTestArrayList {

    public static void main(String[] args) {

        ArrayList<DogArrayList> dogAl = new ArrayList<DogArrayList>();

        dogAl.add(new DogArrayList("뉴뉴", "시츄"));
        dogAl.add(new DogArrayList("유유", "푸들"));
        dogAl.add(new DogArrayList("쿠키", "포메라니안"));
        dogAl.add(new DogArrayList("미미", "시바"));
        dogAl.add(new DogArrayList("나비", "시베리안허스키"));

        for (DogArrayList dr : dogAl) {
            dr.dogShowInfo();
        }

    }
}
