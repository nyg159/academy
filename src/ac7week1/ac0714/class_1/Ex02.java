package ac7week1.ac0714.class_1;

class Person {
    // 1. 필드 : 객체의 속성
    String name;
    int age;
    double height;

    // 2. 메서드 : 객체의 기능(= 행위)
    void run() {        // void run(Person this) 형태로 되어 있음 this 는 메서드를 호출하는 인스턴스를 '구분' 하기 위해서
        System.out.println(name + "(이)가 달린다.");
        System.out.println(this.name + "(이)가 달린다.");
        // this 는 지역변수와 이름이 겹치지 않은면 생략 가능
    }
}

public class Ex02 {
    public static void main(String[] args) {

        // 작성한 클래스는 새로운 자료형이 된다.
        Person per = new Person();              // 생성자

        System.out.println("per = " + per);

        per.name = "홍길동";                   // 객체의 멤버에 접근시 .(dot) 연산자를 사용
        per.age = 24;
        per.height = 168.8;

        System.out.println("per 이름 : " + per.name);
        System.out.println("per 나이 : " + per.name);
        System.out.println("per 신장 : " + per.height);

        per.run();                          // 실행시 run(per); 이렇게 실행은 되지만 주석 처럼 하면 안됨 코드 처럼 작성
    }
}
