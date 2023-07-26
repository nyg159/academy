package ac7week2.ac0721.interface_2;

import java.util.Arrays;
import java.util.Comparator;

class Person implements Comparable<Person>{
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + "(" + age + ")";
    }

    @Override
    public int compareTo(Person o) {
        // this 가 앞, o가 뒤
        return this.age - o.age;    // this 는 생략 가능
//        return age - o.age;
    }
}
public class Ex02 {
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("홍길동", 30),
                new Person("김민지", 26),
                new Person("박철민", 15)
        };

        System.out.println("people = " + Arrays.toString(people));

        Arrays.sort(people);
        System.out.println("오름차순으로 정렬 뒤 : " + people[0]);

        Comparator<Person> ageDesc = (Person o1, Person o2) -> {
            return o2.compareTo(o1);
        };

        Arrays.sort(people,ageDesc);
        System.out.println("내림차순으로 나이 정렬 : " + Arrays.toString(people));


    }
}
