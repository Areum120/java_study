package array2;

public class TwoDimension {
    public static void main(String[] args) {
        //2차원 배열
        //체스게임, 네비게이션 지도, 바둑, 데이터분석, 머신러닝 등
        //3차원은 주로 공간 나타낼 때

        //int[][]arr = new int[2][3];//행개수, 열개수
        int[][]arr = {{1,2,3}, {4,5,6}};

        for(int i =0; i<arr.length; i++){//행의 길이
            for(int j=0; j<arr[i].length; j++){//열의 길이
//                System.out.println(arr[i][j]);
                System.out.println(arr[i][j]);
            }
//            System.out.println();//행 출력 끝난 후 한 줄 띄움
        }



    }
}
