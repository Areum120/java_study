package arraylist;

import java.util.ArrayList;

public class Student {
//    student 클래스의 멤버 변수
    int studentID;
    String name;
    ArrayList<Subject> subjectlist;//수강 과목 목록 arraylist 선언


    //입력받는 생성자
    public Student(int studentID, String name){
        this.studentID = studentID;
        this.name = name;
        subjectlist = new ArrayList<Subject>();//ArrayList 생성하기

    }

    //학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드
    public void addSubject(String name, int score){
        Subject subject = new Subject();//subject생성하기
        subject.setName(name);//과목 이름 추가
        subject.setScorePoint(score);//점수 추가
        subjectlist.add(subject);//배열에 저장

    }

    public void showStudentInfo(){//출력 메서드
        int total=0;
        //향상된 for문
        for(Subject s: subjectlist){
            total+= s.getScorePoint(); //총점더하기
            System.out.println("학생"+name+"의"+s.getName()+"과목의 성적은"+s.getScorePoint()+"입니다.");
        }
        System.out.println("학생"+name+"의 총점은"+total+"입니다.");
    }





}
