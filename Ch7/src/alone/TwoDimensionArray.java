package alone;

public class TwoDimensionArray {
    public static void main(String[] args) {
        //알파벳 소문자를 2글자씩 13줄, 13행 2열로 출력
        char[][] alphabetsArray = new char[13][2];//13행, 2열 배열 만들기
        char ch = 'a';//한글자는 ''

        for (int i = 0; i < alphabetsArray.length; i++) {//행 길이, ch++도 증가했더니 x
            //ch를 alphabetsArray에 입력
            for (int j = 0; j < alphabetsArray[i].length; j++) {//열 길이
                alphabetsArray[i][j] = ch;//a를 입력
                ch++;//a 대입 후 ch 증가
                System.out.println(alphabetsArray[i][j]);
            }
            System.out.println();//두줄씩 띄우기
            }
        }
    }



