package ac7week1.ac0714.class_1;

/*
        생성자(const) : 클래스와 이름이 동일한 이름의 메서드
        주로 필드를 초기화 용도로 자주 사용한다.
        생성자를 작성하지 않으면 "기본 생성자"가 자동으로 생성됨
        기본 생성자는 매개변수가 하나도 없는 생성자
        생성자를 작성 하면 기본 생성자는 자동을 생성되지 않음 !! 기본생성자가 필요 하다면 코드 작성 해줘야 함
 */

class People {
    String name;
    int age;

    People(String name, int age) {      //this 를 사용하는것 권장
        this.name = name;               // 지역변수와 필드가 이름이 겹치면 지역변수를 우선적으로 인식
        this.age = age;                 // 따라서, 필드를 의미하고 싶을 땐 this 를 붙인다.
    }

    People(String name) {      // 오버로딩
        this.name = name;

    }

    People() {
        name = "미정";
        age = -1;
    }



    void showInfo() {
        System.out.printf("%s (%d)세\n", name, age);
    }

    void eat(String food) {
        System.out.printf("%s(이)가 %s 를 먹는다.\n", name, food);
    }

    void talk(People peo) {                      // this.name 이고 그 옆은 매개변수로 받은 것이다.
        System.out.printf("%s 와 %s 가 대화를 한다.\n", name, peo.name);
    }

}



public class Ex04 {
    public static void main(String[] args) {
        People p1 = new People("홍길동", 28);
        People p2 = new People("김민지");
        People p3 = new People();               // 기본생성자가 필요하면 작성해야 함 자동으로 생성 불가

        p1.showInfo();
        p2.showInfo();
        p3.showInfo();
        
        p1.eat("싸이버거");
        p1.eat("파전");

        p2.talk(p1);
        p1.talk(p2);

    }
}
