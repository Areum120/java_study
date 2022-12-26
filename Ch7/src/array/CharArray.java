package array;

public class CharArray {
    public static void main(String[] args) {

        char[] alphabets = new char[26];
        char ch = 'A';//알파벳문자는 실제 메모리에 아스키 코드 값으로 저장됨, ch값에 1을 더하면 1만큼 증가한 값이 배열에 저장됨

        for(int i=0; i<alphabets.length; i++, ch++){
            alphabets[i] = ch;//아스키 값으로 각 요소에 저장
        }

        for(int i=0; i<alphabets.length; i++, ch++){
            System.out.println(alphabets[i] + "," + (int)alphabets[i]);//배열에 저장된 char형 문자를 int형 정수로 변환함
        }


    }
}
