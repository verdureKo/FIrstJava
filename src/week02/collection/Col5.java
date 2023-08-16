package week02.collection;

import java.util.Stack;

/**
 * Queue 은 빨대🥤처럼 한쪽에서 데이터를 넣고 반대쪽에서 데이터를 뺄 수 있는 집합 입니다.
 *
 - 선언 : `Queue<Integer> intQueue` 형태로 선언합니다.
 - 생성 : `new LinkedList<Integer>();` 형태로 생성합니다.
 - 추가 : `intQueue.add({추가할 값})` 형태로 값을 맨 위에 추가합니다.
 - 조회 : `intQueue.peek()` 형태로 맨 아래값을 조회합니다.
 - 꺼내기 : `intQueue.poll()` 형태로 맨 아래값을 꺼냅니다. (꺼내고나면 삭제됨)
 *
 - First In First Out : 먼저들어간 순서대로 값을 조회할 수 있다.
 - 그렇기 때문에 넣는 기능(`add()`),  조회(`peek()`), 꺼내는(`poll()`) 기능만 존재합니다.
 - `Queue` 는 생성자가 없는 껍데기라서 바로 생성할수는 없습니다. (껍데기 = 인터페이스)
 - 생성자가 존재하는 클래스인 `LinkedList` 를 사용하여 `Queue` 를 생성해서 받을 수 있습니다.
 */

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {

    public static void main(String[] args) {
        Queue<Integer> intQueue = new LinkedList<>(); // 선언 및 생성

        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);

        while (!intQueue.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intQueue.poll()); // 1,2,3 출력
        }

        // 다시 추가
        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);

        // peek()
        System.out.println(intQueue.peek()); // 1 출력 (맨먼저 들어간값이 1 이라서 : FIFO)
        System.out.println(intQueue.size()); // 3 출력 (peek() 할때 삭제 안됬음)

        // poll()
        System.out.println(intQueue.poll()); // 1 출력
        System.out.println(intQueue.size()); // 2 출력 (poll() 할때 삭제 됬음)

        System.out.println(intQueue.poll()); // 2 출력
        System.out.println(intQueue.size()); // 1 출력 (poll() 할때 삭제 됬음)

        while (!intQueue.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intQueue.poll()); // 3 출력 (마지막 남은거 하나)
        }
    }
}