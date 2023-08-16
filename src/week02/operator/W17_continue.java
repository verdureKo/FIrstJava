package week02;
/**
 * 입력받은 단을 제외하고 출력
 */

import java.util.Scanner;

public class W17_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); // 출력을 제외할 수

        for (int i = 2; i <= 9; i++) {  // 구구단의 첫 번째 수
            if (i==passNum){
                continue;
            }
            for (int j = 2; j <= 9 ; j++) { // 구구단의 두 번째 수
                System.out.println(i + " 곱하기 " + j + "는 " + (i*j) + "입니다.");
            }
        }
    }
}