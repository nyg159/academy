package ac7week3.ac0724.collection_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/*
    set 을 활용한 중복 제거
    1. 생성자를 활용
 */
public class Ex02 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            int n = random.nextInt((5)+1) * 10; // 10 ~ 50
            arrayList.add(n);
        }

        System.out.println("list = " + arrayList);

        // 생성자 활용
        HashSet<Integer> set = new HashSet<>(arrayList);

        System.out.println("set = " + set);


        arrayList.clear();      // 기존 데이터 제거
        arrayList.addAll(set);  // 중복 제거된 set 을 list 에 추가

        arrayList.sort(null);

        System.out.println("list = " + arrayList);

        System.out.println("list[1] = " + arrayList.get(1));

    }
}
