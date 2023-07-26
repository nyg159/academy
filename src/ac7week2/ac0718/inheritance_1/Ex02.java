package ac7week2.ac0718.inheritance_1;

/*
        자식 생성자는 꼭! 부모 생성자를 호출해야 한다.
        기본 값으로 기본생성자가 호출을 하기 때문에
        기본생성자를 직접 생성 해주거나
        직접 super() 키워드를 사용해야 한다.

 */


import other.Person1;

class Student extends Person1{
    private int score;
    Student(String name, int age,int score){
        super(name,age); // super(내용) -> 부모 생성자 호출

        this.score = score;

    }

    @Override                       // 메서드 오버라이드 : 부모에서 상속 받은 메서드를 '재정의' 하는것
                                    // 나중에 다형성에서 오버라이딩이 중요해진다.
    public void showInfo() {        // 부모의 접근 제어자도 같게 해야함
        super.showInfo();           // super.메소드() -> 부모의 메소드를 호출
        
        String msg = "%s (%d 세, %d 점) \n";
        System.out.printf(msg,name,age,score);
    }

    void study(String sub) {
        String msg = "%s 이가 %s 을를 공부합니다.\n";
        System.out.printf(msg,name,sub);

    }
}

public class Ex02 {
    public static void main(String[] args) {
        Person1 person1 = new Person1("홍길동", 30);

        person1.eat("라면");

        person1.showInfo();

        Student stu = new Student("박수진", 18, 88);

        stu.eat("싸이버거");         // 1. 부모에게 그대로 물려받은 메서드
        stu.showInfo();                 // 2. 재정의 한 메서드
        stu.study("java");         // 3. 자식에서 생성된 메서드 (= 새 기능)


    }
}
