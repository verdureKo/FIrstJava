package week02.collection;

import java.util.ArrayList;

/**
 * List : 순서가 있는 데이터의 집합, 데이터의 중복을 허용한다.
 * - 선언 : `ArrayList<Integer> intList` 형태로 선언합니다.
 * - 생성 : `new ArrayList<Integer>();` 형태로 생성합니다.
 * - 초기화 : 사이즈를 지정하는것이 없기 때문에 초기화가 필요 없습니다.
 * - 값 추가 : `intList.add({추가할 값})` 형태로 값을 추가합니다.
 * - 값 수정 : `intList.set({수정할 순번}, {수정할 값})` 형태로 값을 수정합니다.
 * - 값 삭제 : `intList.remove({삭제할 순번})` 형태로 값을 삭제합니다.
 * - 전체 출력 : `intList.toString()` 형태로 전체 값을 대괄호`[]`로 묶어서 출력합니다.
 * - 전체 제거 : `intList.clear()` 형태로 전체 값을 삭제합니다.
 */
public class Col1 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 및 생성

        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println(intList.get(0)); // 0번째 수 출력
        System.out.println(intList.get(1)); // 1번째 수 출력
        System.out.println(intList.get(2)); // 2번째 수 출력
        System.out.println(intList.toString()); // 배열 출력

        intList.set(1, 10); // .set() 수정 명령어 : 1번순번의 값을 10으로 수정합니다.
        System.out.println(intList.get(1)); // 10 출력


        intList.remove(1); // .remove() 선택 삭제 명령어 : 1번쨰 순번(2)의 값을 삭제합니다.
        System.out.println(intList.toString()); // [1,3] 출력

        intList.clear(); //.clear() 전체 삭제 명령어 : 전체 값을 삭제합니다.
        System.out.println(intList.toString()); // [] 출력
    }
}
