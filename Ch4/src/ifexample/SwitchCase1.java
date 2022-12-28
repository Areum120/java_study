package ifexample;

public class SwitchCase1 {
    public static void main(String[] args) {
        //조건이 하나의 변수 값이나 상수 값으로 구분될 때 사용
        //defalt는 if문의 else와 같음
        //조건이 복잡하면 if문 사용
        int ranking = 4;
        char medalColor;

        switch (ranking){
            case 1: medalColor = 'G';
                    break;
            case 2: medalColor = 'S';
                    break;
            case 3: medalColor = 'B';
                    break;
            default:
                    medalColor = 'A';

        }
        System.out.println(ranking+"등 메달의 색깔은 "+ medalColor + "입니다.");

    }
}
