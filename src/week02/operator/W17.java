package week02;

public class W17 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {  // 구구단의 첫 번째 수
            for (int j = 2; j <= 9 ; j++) { // 구구단의 두 번째 수
                System.out.println(i + " 곱하기 " + j + "는 " + (i*j) + "입니다.");
            }
        }
    }
}