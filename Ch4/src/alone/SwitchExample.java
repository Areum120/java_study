package alone;

public class SwitchExample {
    
    public static void main(String[] args) {

        int floor = 2;
        String mall;
        
        switch(floor){

            case 1: mall = "약국";//case다음에 띄어써야 함
                break;

            case 2: mall = "정형외과";
                break;

            case 3: mall = "피부과";
                break;

            case 4: mall = "치과";
                break;

            default: mall = "상점이 없습니다";
            //default: System.out.println("층이 없습니다."); 출력문이 Variable 'mall' might not have been initialized오류가 남
        
        }
        System.out.println(floor+"층은 "+ mall + " 입니다.");

    }
    
}

