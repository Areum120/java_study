package array;

public class EnhacedForLoop {
    public static void main(String[] args) {
        //향상된 for문: 처음부터 끝 요소까지 참조할 떄 편리한 반복문

        String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};

        for(String lang : strArray){
            System.out.println(lang);
        }
        //1분 복습
       int[] numArray = {1,2,3,4,5,6,7,8,9,10};

        for(int num : numArray){
            System.out.println(num);
        }


    }
}
