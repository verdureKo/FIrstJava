package week02.array;

/**
 * 3차원 배열의 초기화는 중괄호를 이용해 초기화 할 수 있다.
 */
public class Arr07 {
    public static void main(String[] args) {
        // 가변배열
        int [][] array = new int [3][];

        // 배열 원소마다 각기 다른 크기로 지정
        array[0] = new int[2];
        array[1] = new int[1];
        array[2] = new int[2];

        // 중괄호로 초기화를 아예 해버릴 때도 가능
        int [][] array2 = {
                {10, 20},
                {10, 20, 30, 40},
                {10}
        };

        for (int i = 0; i < array2.length; i++) { // 1차원 길이
            for (int j = 0; j < array2[i].length; j++) { // 2차원 길이
                System.out.println(array2[i][j]); // 2중 반복문으로 i, j 인덱스 순회
            }
        }

        // 3차원 배열의 이해

        // 중괄호 3개를 써서 3차원 배열 초기화를 할 수 있습니다.
        int[][][] MultiArray = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};

    }
}
