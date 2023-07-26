package ac7week3.ac0724.collection_1;

import java.util.Comparator;
import java.util.LinkedList;

/*

 */
public class Ex03 {
    public static void main(String[] args) {
        // ArrayList vs LinkedList
        // 1. ArrayList : 속도 빠름, 변화에 취약
        // 2. LinkedList : ArrayList 보다는 느림, 변화에 상관 없음

        LinkedList<String> list = new LinkedList<>();
        list.add("C/C++");
        list.add("Python");
        list.add("Go");
        list.add("Java");

        System.out.println("list = " + list);

        list.sort(null);
        System.out.println("list.sort : " + list);

        list.sort((String o1, String o2) -> {
            return o2.compareTo(o1);
        });
        System.out.println("list : " + list);
    }
}
