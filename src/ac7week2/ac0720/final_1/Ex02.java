package ac7week2.ac0720.final_1;


class Super {
    int a = 10;

    final void superMethod() {                  // final 키워드 사용
        // 2. 메서드에 사용  :   오버라이드를 방지합니다. 오버라이드 금지
        System.out.println("부모의 메서드 입니다.");
    }
}

final class Sub extends Super {     // final 키워드 사용
    //        3. 클래스에 사용  :   상속이 불가능한 클래스로 지정(기능확장 불가, 자식클래스를 만들수 없음)
//    @Override
//    void superMethod() {          ------ 오류 ------
//        System.out.println("자식에서 재정의 됨");
//    }
    // final 메소드는 자식에서 재정의가 불가능하다.
}

//class SSub extends sub {       ----- 오류-------
//    final 클래스는 상속을 받을수 없다
//}

public class Ex02 {
    public static void main(String[] args) {
        Sub sub = new Sub();

        sub.superMethod();

    }
}
