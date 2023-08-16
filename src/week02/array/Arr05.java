package week02.array;

public class Arr04 {
    public static void main(String[] args) {
        // 깊은 복사
        int[] a = { 1, 2, 3, 4 };
        int[] b = new int[a.length]; // a의 배열만큼 b를 만든다

        for (int i = 0; i < a.length; i++) { // for문을 통해 0번째부터 3번째 배열의 값을 b배열에 복사한다
            b[i] = a[i]; // 깊은 복사
        }

        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

        System.out.println(a[0]); // 출력 1 <- 깊은 복사를 했기때문에 a 배열은 그대로 입니다.
    }
}
