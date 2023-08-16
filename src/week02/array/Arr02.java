package week02.array;

public class Arr01 {
    public static void main(String[] args) {
        int[] intArray = new int[3];    // 배열을 3개 가지고있는 배열 선언
        boolean[] boolArray = new boolean[3];
        String[] stringArray = new String[3];

        // 배열 선언 먼저하고 ->  나중에 초기화
        int[] intArray2;
        intArray2 = new int[3];

        System.out.println(intArray[1]);
        System.out.println("-------------------");

        for (int i = 0; i < intArray2.length; i++) {
            System.out.println(intArray2[i]);
        }
    }
}
