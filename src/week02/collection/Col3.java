package week02.collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * LinkedList 는 메모리에 남는 공간을 요청해서 여기저기 나누어서 실제값을 담아놓고, 실제값이 있는 주소값으로 목록을 구성하고 저장합니다.
 *
 * - 선언 : `LinkedList<Integer> linkedList` 형태로 선언합니다.
 * - 생성 : `new LinkedList<Integer>();` 형태로 생성합니다.
 * - 초기화 : 사이즈를 지정하는것이 없기 때문에 초기화가 필요 없습니다.
 * - 값 추가 : `linkedList.add({추가할 값})` 형태로 값을 추가합니다.
 * - 값 중간에 추가 : `linkedList.add({추가할 순번}, {추가할 값})` 형태로 값을 중간에 추가합니다.
 * - 값 수정 : `linkedList.set({수정할 순번}, {수정할 값})` 형태로 값을 수정합니다.
 * - 값 삭제 : `linkedList.remove({삭제할 순번})` 형태로 값을 삭제합니다.
 * - 전체 출력 : `linkedList.toString()` 형태로 전체 값을 대괄호`[]`로 묶어서 출력합니다.
 * - 전체 제거 : `linkedList.clear()` 형태로 전체 값을 삭제합니다.
 *
 * - 기본적인 기능은 `ArrayList` 와 동일하지만 `LinkedList` 는 값을 나누어 담기 때문에 모든값을 조회하는 속도가 느립니다.
 *  대신에, 값을 중간에 추가하거나 삭제할때는 속도가 빠릅니다.
 * - 중간에 값을 추가하는 기능이 있습니다. (속도 빠름)
 */
public class Col2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(); // 선언 및 생성

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList.get(0)); // 1 출력
        System.out.println(linkedList.get(1)); // 2 출력
        System.out.println(linkedList.get(2)); // 3 출력
        System.out.println(linkedList.toString()); // [1,2,3] 출력 (조회할 때 속도 느림)

        linkedList.add(2, 4); // 2번 순번에 4 값을 추가합니다. (값을 중간에 넣을 때 속도가 빠르다.)
        System.out.println(linkedList); // [1,2,4,3] 출력

        linkedList.set(1, 10); // 1번순번의 값을 10으로 수정합니다.
        System.out.println(linkedList.get(1)); // 10 출력

        linkedList.remove(1); // 1번순번의 값을 삭제합니다. (값을 중간에 삭제할 때 속도가 빠르다.)
        System.out.println(linkedList); // [1,4,3] 출력

        linkedList.clear(); // 전체 값을 삭제합니다.
        System.out.println(linkedList); // [] 출력
    }
}
