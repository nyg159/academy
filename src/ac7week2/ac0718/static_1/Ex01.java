package ac7week2.ac0718.static_1;
/*
        클래스 맴버는 2가지 상태를 가진다
        1. 일반 맴버 : 인스턴스 맴버
        - 인스턴스 마다 고유하게 생성되는 맴버
        
        2. 정적 맴버 : 클래스 맴버
        - 클래스 자체가 가지는 맴버
        - 인스턴스가 공유해서 사용하는 맴버
        - 공통 값을 세팅 하거나 사용 할 때  사용 함
        - 클래스 명으로 작성
        
 */

class Person {
    // 일반 맴버
    String name;
    int age;

    // 정적 맴버
    static int eyes = 2;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        String msg = "%s (%d 세 눈 %d 개)";
        System.out.printf(msg, name, age, eyes);
    }
}
public class Ex01 {
    public static void main(String[] args) {

        Person p1 = new Person("홍길동", 30);
        Person p2 = new Person("김민지", 40);
        Person p3 = new Person("박철수", 50);

//        p1.eyes = 3;                                    // 전부다 눈이 3개가 됨 이렇게 작성하지 말고 클래스 명으로 작성
        Person.eyes = 3;                                  // 이렇게 작성

        p1.showInfo();
        p2.showInfo();
        p3.showInfo();
    }
}
