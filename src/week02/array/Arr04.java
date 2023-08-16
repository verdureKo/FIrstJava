package week02.array;

import java.util.Arrays;

public class Arr03 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a; // 얕은 복사

        b[0] = 3;
        System.out.println(a[0]); // a는 바뀌지 않아야 하지만 값이 바뀌게 됨
    }
}
