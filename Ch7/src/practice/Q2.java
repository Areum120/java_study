package practice;

public class Q2 {
    public static void main(String[] args) {
        //알파벳 소문자 배열 생성
        char[] alphabets = new char[26];

        char ch = 'a';

        for(int i=0; i<alphabets.length; i++, ch++){
            alphabets[i] = ch;//아스키값으로 각 요소에 저장
        }
        //위 for문에서 값 저장한 alphabets[i] 변수를 바로 사용할 수 있나?
//        System.out.println(alphabets[i]);//for문 안에서만 사용


        for(int i=0; i< alphabets.length; i++){//위에서 for문에 저장해야 alphabets[i]가 나옴
            System.out.println(alphabets[i] + "," + (int)alphabets[i]);//소문자와, 아스키값 출력
        }

    }

}
