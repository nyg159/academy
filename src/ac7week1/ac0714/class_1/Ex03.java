package ac7week1.ac0714.class_1;
/*

        메서드에 왜 this 라는게 생략 되어 있을까?
        메서드를 호출하는 인스턴스를 '구분' 하기 위해서

 */

//class Person {        Class 는 같은 패키지 안에서 공유가 된다.
//                        여기서 클래스를 생성하면 중복되어 오류 발생 Ex02에 Person 클래스가 존재 하기 때문
//
//}

public class Ex03 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "홍길동";
        p2.name = "김민수";

        p1.run();       // Ex02 에 있는 Person 안 run 메소드가 실행됨
        p2.run();       // Ex02 에 있는 Person 안 run 메소드가 실행됨

        
    }
}
