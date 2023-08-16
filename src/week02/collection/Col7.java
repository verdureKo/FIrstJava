package week02.collection;

/**
 * Set 은 순서가 없는 데이터의 집합 (데이터 중복 허용 안함) - 순서없고 중복없는 배열
 *
 - 선언 : `Set<Integer> intSet` 형태로 선언합니다.
 - 생성 : `new HashSet<Integer>();` 형태로 생성합니다.
 - 추가 : `intSet.add({추가할 값})` 형태로 값을 맨 위에 추가합니다.
 - 조회 : `intSet.get({초회할 순번})` 형태로 순번에 있는 값을 조회합니다.
 - 삭제 : `intSet.remove({삭제할 값})` 형태로 삭제할 값을 직접 지정합니다.
 - 포함확인 : `intSet.contains({포함확인 할 값})` 형태로 해당값이 포함되어있는지 boolean 값으로 응답 받습니다.
 *
 - 순서가 보장되지 않는 대신 중복을 허용하지 않도록 유지할 수 있습니다.
 - `Set` 은 그냥 `Set`으로 쓸수도있지만 `HashSet`, `TreeSet` 등으로 응용하여 사용할 수 있습니다.
 - `Set` 는 생성자가 없는 껍데기라서 바로 생성할수는 없습니다. (껍데기 = 인터페이스)
 - 생성자가 존재하는 클래스인 `HashSet` 를 사용하여 `Set` 를 생성해서 받을 수 있습니다.
 🔎 `HashSet` 외에도 `TreeSet`, `LinkedHashSet` 이 있습니다.
 - `HashSet` : 가장 빠르며 순서를 전혀 예측할 수 없음
 - `TreeSet` : 정렬된 순서대로 보관하며 정렬 방법을 지정할 수 있음
 - `LinkedHashSet` : 추가된 순서, 또는 가장 최근에 접근한 순서대로 접근 가능
 즉, 보통 `HashSet` 을 쓰는데 순서보장이 필요하면 `LinkedHashSet` 을 주로 사용합니다.
 */

import java.util.HashSet;
import java.util.Set;

public class Col6 {

    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<Integer>(); // 선언 및 생성

        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(3); // 중복된 값은 덮어씁니다.
        intSet.add(3); // 중복된 값은 덮어씁니다.

        for (Integer value : intSet) {
            System.out.println(value); // 1,2,3 출력
        }

        // contains()
        System.out.println(intSet.contains(2)); // .contains() : 집합에 수가 포함되어 있는지 판별하는 명령어
        System.out.println(intSet.contains(4)); //

        // remove()
        intSet.remove(3); // 3 삭제

        for (Integer value : intSet) {
            System.out.println(value); // 1,2 출력
        }
    }
}