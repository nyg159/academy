package ac7week2.ac0719.inheritance_2;

/*
        아래 클래스를 구현
        // 단, other.Person_2 을 상속 받는다.

        stu.eat("라면");      // 1. 부모에서 상속 받은 그대로

        stu.showInfo();      // 2. 오버라이딩

        stu.study("JAVA");   // 3. 자식에서 생성한 메서드

 */

import other.Person_2;

class Student extends Person_2 {
    private int score = 0;

    protected Student(String name,int age, int score ) {
        super(name,age);
        this.score = score;

    }

    public void showInfo() {
        super.showInfo();

        String msg = "%s 는 (%d 세 %s 점)\n";
        System.out.printf(msg, name, age, score);

    }

    public void study(String major) {
        String msg = "%s 이가 %s 를 공부합니다.\n";
        System.out.printf(msg,name,major);
    }


}

public class Ex01 {
    public static void main(String[] args) {


        // 단, other.Person_2 을 상속 받는다.
        Student stu = new Student("홍길동", 15, 50);

        stu.eat("라면");      // 1. 부모에서 상속 받은 그대로

        stu.showInfo();      // 2. 오버라이딩

        stu.study("JAVA");   // 3. 자식에서 생성한 메서드


    }
}
