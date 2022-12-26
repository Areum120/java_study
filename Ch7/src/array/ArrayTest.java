package array;

public class ArrayTest {
    public static void main(String[] args) {
        //배열 선언
        int[]num = new int[] {1,2,3,4,5,6,7,8,9,10};

        //값 출력
        for(int i = 0; i < num.length; i++){//i<10이 i<=9보다 직관적, num.length는 len(num)과 같음
            System.out.println(num[i]);
        }

        int[]arr = new int[]{3,6,9,12};


    }
}
