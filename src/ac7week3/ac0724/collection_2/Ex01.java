package ac7week3.ac0724.collection_2;

/*
        Set : 순서 없고 중복 없음
        중복된 데이터를 제거 하기 위해서 사용됨
        보통 사용 방법 : 중복이 있는 리스트를 set 으로 바꾸고 다시 리스트로 변환 함
        - 하위 클래스 : hashSet, TreeSet 등이 있다.

 */


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Ex01 {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        set.add(10);    // 중복된 데이터는 무시된다.

        System.out.println("set = " + set);
//        System.out.println("set[0] = "+set.get(0));   index 가 없어 indexing 불가능

        set.remove(20);     // 해당 값(요소)을 제거

        System.out.println("set 의 길이 : " + set.size());

        Integer[] arr = new Integer[]{10, 20, 30, 40, 50};

        set.addAll(Arrays.asList(arr));
        System.out.println("set : " + set);

        // set 은 index 가 없어서 일반 for 사용이 불가능이다.

        for (int n: set) {
            System.out.println("n : " + n);

        }

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int number = it.next();
            System.out.println("number = " + number);
        }


    }
}
