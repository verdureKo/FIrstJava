package week02;

import java.util.Scanner;

public class W17_scanner {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int thisNum = sc.nextInt(); // 구구단 첫 번째 수는 입력받는다.
        for (int i = 2; i <= 9 ; i++) { // 구구단의 두 번째 수
            System.out.println(thisNum + " 곱하기 " + i + "는 " + (thisNum*i) + "입니다.");
        }
    }
}