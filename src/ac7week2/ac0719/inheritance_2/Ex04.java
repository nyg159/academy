package ac7week2.ac0719.inheritance_2;

import other.Person_2;

public class Ex04 {
    public static void main(String[] args) {
        // 다운 캐스팅을 잘못하면 에러가 발생한다.
        // 이를 탐지하기 위한 키워드가 존재한다.

        Person_2 p1 = new Student("박지성", 33, 75);
        Person_2 p2 = new Police("손흥민", 42, "경장");

        System.out.println(p1 instanceof Student);  // 출력은 true
        // p1 은 Student 의 인스턴스가 맞습니까 ?
        // 조건문에 사용하면 좋다 왜냐 출력이 boolean 형으로 나오기 때문

        System.out.println(p1 instanceof Police);
        // p1 은 Police 의 인스턴스가 맞습니까?    false

        System.out.println(p2 instanceof Student);
        // p2 는 Student 의 인스턴스가 맞습니까? false

        System.out.println(p2 instanceof Police);
        // p2 는 Police 의 인스턴스가 맞습니까? true

    }
}
