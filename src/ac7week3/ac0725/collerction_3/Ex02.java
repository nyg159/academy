package ac7week3.ac0725.collerction_3;

/*
        Map : key 와 value 의 자료 구조
        XML 또는 JSON 이라는 파일과 호환이 좋다
        주로 객체(데이터)를 타 시스템과 주고 받기 위해서 자주 사용된다
        key 는 index 대신에 값에 접근할 용도로 사용 - key 는 중복 불가
        value 는 실제로 저장할 데이터


 */


import java.util.HashMap;

public class Ex02 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Java", 70);
        hashMap.put("Python", 90);
        hashMap.put("C#", 80);

        hashMap.put("Java", 70);    // 중복된 key 값을 할당하면 value 를 덮어쓴다 key 는 중복불가
        hashMap.put("Go", 80);      // value 는 중복 가능

        System.out.println("hashMap = " + hashMap);

        System.out.println("hashMap[java] = " + hashMap.get("java"));
        // map 사용법 : index 대신 key 로 value 에 접근한다.


    }
}
