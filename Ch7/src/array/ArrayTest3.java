package array;

public class ArrayTest3 {
    public static void main(String[] args) {

        double[] data = new double[5];
        int size = 0;

        data[0] = 10.0; size++;
        System.out.println(size);//1
        data[1] = 20.0; size++;
        System.out.println(size);//2
        data[2] = 30.0; size++;
        System.out.println(size);//3

        for(int i =0; i<size; i++){//유효한 size 갯수 3만큼 반복
            System.out.println(data[i]);//0,1,2번째 요소들이 출력됨
        }


    }
}
