package alone;

public class IfExample {
    public static void main(String[] args) {
        //성적에 따라 학점 부여
        int score=80;
        char grade;
        if(score>=90){
            grade='A';
        }
        else if(score>=80){
            grade='B';
        }
        else if(score>=70){
            grade='C';
        }
        else if(score<=60){
            grade='D';
        }
        else{
            grade='F';
        }
        System.out.println(score+"점수의 "+"성적은 "+grade+"입니다.");

    }
}
