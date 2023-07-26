package ac7week2.ac0721.interface_2;

import java.util.Arrays;
import java.util.Comparator;

/*
        배열을 이름순으로 오름차순과 내림차순으로 둘다 출력
        필요 하면 access 메서드를 작성한다.
        interface_2.Ex02 Person 클래스를 사용한다.
 */
public class Quiz01 extends Person {

    Quiz01(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("홍길동", 30),
                new Person("김민지", 26),
                new Person("박철민", 15)
        };

        System.out.println("사람 배열 출력 : "+ Arrays.toString(people));

        Comparator<Person> asc = (Person o1, Person o2) -> {
            String o11 = o1.getName();
            String o22 = o2.getName();

            return o11.compareTo(o22);
        };

        Arrays.sort(people,asc);

        System.out.println("사람 배열 오른차순 후 출력 : "+ Arrays.toString(people));

//        Comparator<Person> desc = (Person o1, Person o2) -> {
//            String o11 = o1.getName();
//            String o22 = o2.getName();
//
//            return o22.compareTo(o11);
//        };            바로 밑줄로 줄여 사용 가능

        Arrays.sort(people,(Person o1, Person o2)->{
            return o1.getName().compareTo(o2.getName());
        });
        System.out.println("사람 배열 내림차순 후 출력 : "+ Arrays.toString(people));
    }
}
