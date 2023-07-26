package ac7week3.ac0725.collerction_3;

/*
        Tree Set
        - Tree 라는 자료구조 기반으로 반들어진 Set
        - 출력시 오름차순으로 출력
        TreeSet 은 기본 Comparable 을 가지고 정렬한다.
        다른 비교 기준을 사용하려면 생성자에 Comparator 를 구현해서 넘긴다.

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

 */

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet();

        for (int i = 0; i <= 10; i++) {
            int n = random.nextInt(100) + 1;
            hashSet.add(n);

        }
        System.out.println("hashset = " + hashSet);


        TreeSet<Integer> treeSet1 = new TreeSet<>(hashSet);
        System.out.println("treeSet = " + treeSet1);



        // 내림차순으로 하는 법
        TreeSet<Integer> treeSet2 = new TreeSet<>((Integer o1, Integer o2) -> o2 - o1);
        treeSet2.addAll(treeSet2);

        System.out.println(treeSet2);
        
        
        
    }

}
