package practice;

public class Q1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        char operator = '*';
        int sum = 0;

        //if문
        System.out.println("-----if문-----");
        if(operator=='+'){
            sum = num1 + num2;
        }
        else if(operator=='*'){
            sum = num1 * num2;
        }
        else if(operator=='-'){
            sum = num1 - num2;
        }
        else if(operator=='/'){
            sum = num1 / num2;
        }
        else {
            System.out.println("계산이 불가합니다.");
        }
        System.out.println("정답은"+sum+"입니다.");

        //switch문
        System.out.println("-----switch문-----");
        switch (operator){
            case '+':
                sum = num1 + num2;
                break;
            case '*':
                sum = num1 * num2;
                break;
            case '-':
                sum = num1 - num2;
                break;
            case '/':
                sum = num1 / num2;
                break;
            default:
                System.out.println("계산이 불가합니다.");

        }
        System.out.println("정답은"+sum+"입니다.");


    }
}
