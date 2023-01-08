package practice;

public class Q3 {
    public static void main(String[] args) {
        //배열 길이가 5인 정수형 배열 선언, 1~10 중 짝수만을 배열에 저장한 후 그 합을 출력하세요
       int[] num = new int[5];

        //어려운 점 2,4,6,8,10을 0,1,2,3,4 번째 배열에 삽입
        //0,1,2,3,4에 2,3,4,5,6을 더하기

        int i, j,  EvenNum;
        int total=0;
        for (i=0, j=2; i < num.length; i++, j+=1) {//j를 2부터 시작해서 1씩 더하기
//            System.out.println(i);//0,1,2,3,4
            EvenNum = i+j;
            num[i]=EvenNum;
//            System.out.println(num[i]);
            total+=num[i];
            }
        System.out.println(total);


    }

}