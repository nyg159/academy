package ac7week3.ac0725.collerction_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/*
        Map 의 key 는 String Value 는 Object 가 가장 자주 사용됨
        1. key 는 문자열로 접근이 가장 수월하기 때문
        2. value 는 모든 데이터를 받기 위해서 Object 로 사용되는 경우가 많음
        3. Map 은 반복이 불가능한 구조 이다.


 */
public class Ex03 {
    public static void main(String[] args) {

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("age", 25);
        hashMap.put("address", "부산광역시");

        System.out.println("hashMap = " + hashMap);

        Set<String> keys = hashMap.keySet();

        for (String k: keys
             ) {
            System.out.println(k + " : "+hashMap.get(k));
        }
        System.out.println();

        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String n = iterator.next();
            System.out.println(n + " : " + hashMap.get(n));
        }
    }
}
