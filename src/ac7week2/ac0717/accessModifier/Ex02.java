package ac7week2.ac0717.accessModifier;

import other.Person;
/*
        package 클래스는 외부로 가져올 수 없음
 */
public class Ex02 {
    public static void main(String[] args) {
        Person per = new Person("박민수",15,165.4);
//        Other.Person per = new Other.Person("박민수",15,165.4);
        // import 안했을 시 이렇게 작성하면 된다.
        per.showInfo();

    }
}
