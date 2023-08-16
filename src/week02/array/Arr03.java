package week02.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        String[] stingArray = {"a", "b", "c", "d"}; // 이건 언제 출력해?

        for (int i = 0; i < intArr.length; i++) { // 기본 for문으로 배열을 출력하는 방법
            intArr[i] = i;
        }
        System.out.println("------------------");

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
        System.out.println("------------------");

        int[] intArr2 = {10, 20, 30, 40, 50};
        for (int item: intArr2) { // 향상된 for문으로 배열을 출력하는 방법
            System.out.println(item);
        }
        System.out.println("------------------");

        Arrays.fill(intArr, 1); // 배열에 수를 넣는 방법
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
