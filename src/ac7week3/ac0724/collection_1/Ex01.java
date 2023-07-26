package ac7week3.ac0724.collection_1;

/*
        Collection framework
        - 자바에서 제공하는 자료구조

        종류  아래 3타입은 인터페이스로 작성되어 있다.
        1. List : 순서가 있고 중복도 있다
        ArrayList, LinkerList

        2. Set  : 순서가 없고 중복도 없다.

        3. Map  : key, value 의 한쌍의 구조(key 는 중복 없음)

 */


import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        // List 는 인터페이스이므로 이를 직접 구현한 하위 클래스를 사용한다.
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);   // add(값) : 리스트 가장 뒤에 지정 데이터를 추가
        list.add(20);   // 리스트는 배열처럼 크기를 지정하지 않고 동적을 크기가 자동으로 늘었다 줄었다 한다.
        list.add(30);
        list.add(10);   // 데이터의 중복도 허용
        
        System.out.println("list : " + list);   // toString 오버라이드가 되어 있어서 바로 출력 가능

        System.out.println("list[0] : "+ list.get(0));  // 이렇게 메소드로 접근해야 함

        System.out.println("list[1] : " + list.get(1));
        list.set(1, 23);    // 1번 위치 데이터를 23 으로 변경
        System.out.println("list[1] : " + list.get(1));

        list.add(1, 70);        // 중간에 추가를 하면 이전 값이 뒤로 다 밀려난다.
        System.out.println("list : " + list);

        list.remove(2);             // 지정 인덱스를 제거 하고 다시 자리를 채운다.
        int n = list.remove(2);     // 이렇게 값을 제거하면서 값을 받을 수 있다.
        System.out.println("제거한 값 : " + n + "\n");

        System.out.println("리스트의 크기 : " + list.size());   // 현재 리스트 안에 있는 요소 갯수를 반환

        System.out.println("70의 위치? : " + list.indexOf(70));    // 존재 하지 않으면 -1 로 반환한다.

        
        list.clear();   // 리스트 요소 전체 제거
        System.out.println("리스트 : " + list);
        
        System.out.println("빈 리스트 인가? : "+ list.isEmpty());     // 빈리스트 인지 확인용

    }
}
