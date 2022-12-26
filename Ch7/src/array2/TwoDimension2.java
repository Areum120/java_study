package array2;

public class TwoDimension2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];//2행 3열 2차원 배열 선언

        for(int i=0; i<arr.length; i++){//행길이
            for(int j=0; j<arr[i].length; j++){//열길이
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println(arr.length);//행길이
        System.out.println(arr[0].length);//열길이
    }
}
