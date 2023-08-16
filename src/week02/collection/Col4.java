package week02.collection;

import java.util.Stack;

/**
 * `Stack` 은 값을 수직으로 쌓아놓고 넣었다가 빼서 조회하는 형식으로 데이터를 관리 합니다.
 * 이걸 **“나중에 들어간 것이 가장 먼저 나온다(Last-In-First-out)”** 성질을 가졌다고 표현하며, 주로 상자와 비유해서 설명합니다.
 *
 * - 선언 : `Stack<Integer> intStack` 형태로 선언합니다.
 * - 생성 : `new Stack<Integer>();` 형태로 생성합니다.
 * - 추가 : `intStack.push({추가할 값})` 형태로 값을 추가합니다.
 * - 조회 : `intStack.peek()` 형태로 맨 위값을 조회합니다.
 * - 꺼내기 : `intStack.pop()` 형태로 맨 위값을 꺼냅니다. (꺼내고나면 삭제됨)
 *
 * - 상자에 물건을 넣고 빼는것처럼 밑에서 위로 쌓고, 꺼낼때는 위에서 부터 꺼내는 형식입니다.
 * - 그렇기 때문에 넣는 기능(`push()`) 과 조회(`peek()`), 꺼내는(`pop()`) 기능만 존재합니다.
 * - 이렇게 불편하게 쓰는 이유는 최근 저장된 데이터를 나열하고 싶거나 데이터의 중복처리를 막고싶을때 사용합니다.
 */

public class Col3 {

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성

        intStack.push(1);   // ArrayList나 LinkedList와 다르게 .push() 명령어를 쓴다.
        intStack.push(2);
        intStack.push(3);

        while (!intStack.isEmpty()) { // .isEmpty() : 다 지워질때까지 출력
            System.out.println(intStack.pop()); // 3,2,1 출력
        }

        System.out.println("------------------ push()");
        // 다시 추가
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("------------------ peek()");
        // peek()
        System.out.println(intStack.peek()); // 3 출력
        System.out.println(intStack.size()); // 3 출력 (peek() 할때 삭제 안됬음)

        System.out.println("------------------ pop()");
        // pop()
        System.out.println(intStack.pop()); // 3 출력
        System.out.println("------------------ size()");
        System.out.println(intStack.size()); // 2 출력 (pop() 할때 삭제 됬음)

        System.out.println("------------------ pop()");
        System.out.println(intStack.pop()); // 2 출력
        System.out.println("------------------ size()");
        System.out.println(intStack.size()); // 1 출력 (pop() 할때 삭제 됬음)

        while (!intStack.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intStack.pop()); // 1 출력 (마지막 남은거 하나)
        }
    }
}