package practice;

public class Q4 {
//    별피라미드를 파라미터로 받으시오

    String space = " ";
    String letter;
    int num;

    public Q4(){
        //기본 생성자도 사용
    }

    public Q4(String letter, int n){
        this.letter = letter;
        this.num = n;
    }

    public void createPiramidStar(String letter, int n){
        int i,j;
        for(i=0; i<=n; i++){
            for(j=0; j<=n-i; j++){
                System.out.print(space);
            }
            for(j=1; j<= 2*i+1; j++){
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Q4 q4= new Q4();
        q4.createPiramidStar("*", 4);

    }
}