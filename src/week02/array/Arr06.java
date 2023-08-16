package week02.array;

public class Arr05 {
    public static void main(String[] args) {

        // 문자(char / 1byte), 문자열(String)
        // String = char[]

        // 기본형 변수 vs 참조형 변수
        // 1. 기본형 변수는 '소문자로 시작함', 반면, 참조형 변수는 '대문자로 시작함'
        // - Wrapper class에서 기본형 변수를 감싸줄 때(boxing), int -> Integer
        // 2. 기본형 변수는 값 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 저장 함(= 주소형 변수)

        // char < String (훨씬 더!)
        // String이 가지고 있는 기능이 너무 많아서
        // Wrapper class와도 비슷 -> 기본형 변수가 가지고 있는 기능이 제한 -> 다양한 기능을 제공하는 Wrapper을 감쌈으로써, 추가기능을 더함

        // String 기능 활용 예
        String str = "ABCD";

        // (1) length
        int strLength = str.length();
        System.out.println(strLength); // 문자열의 길이를 출력해달라

        // (2) charAt
        char strChar = str.charAt(1);
        System.out.println(strChar); // 인덱스 1번째 문자 출력해달라

        // (3) substring(int fromIdx, int toIdx)
        String strSub = str.substring(0, 3);
        System.out.println(strSub); // 0번째 부터 3번째까지 썰어달라

        // (4) equals(String str)
        String newStr = "ABCD";
        boolean strEquals = newStr.equals(str);
        System.out.println(strEquals); // 일치 여부를 판별할 때 사용한다

        // (5) toCharArray : String -> char[]
        char[] strCharArray = str.toCharArray();

        // (6) 반대로 char[] -> String -> char
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);

    }
}
