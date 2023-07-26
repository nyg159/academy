package ac7week3.ac0725.collerction_3;

/*
        TreeMap : key 순으로 정렬된다.

 */


import java.util.TreeMap;

public class Ex04 {
    public static void main(String[] args) {
        TreeMap<String, Object> treeMap = new TreeMap<>();

        treeMap.put("name", "홍길동");
        treeMap.put("age", 25);
        treeMap.put("address", "부산광역시");

        System.out.println("treeMap = " + treeMap);

        // 이건 참고용
        treeMap.forEach((String k, Object y) -> System.out.println(k + " : " + y));
    }
}
