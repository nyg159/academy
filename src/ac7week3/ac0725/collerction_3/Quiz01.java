package ac7week3.ac0725.collerction_3;


/*
        1. Person 클래스 작성 이름, 나이만
        2. TreeSet 에 Person 3개 정도 저장 후 출력 (이름 오름차순)
        3. Comparator 을 사용하여 나이순으로 내림차순후 출력
 */

import java.util.TreeSet;

class Person {
    private String name;
    private int age;

    Person(String name,int age) {
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
        return String.format("%s (%d 세)", name, age);
    }
}

public class Quiz01 {
    public static void main(String[] args) {
        Person p1 = new Person("김철수", 56);
        Person p2 = new Person("박민지", 29);
        Person p3 = new Person("장숙민", 80);

        TreeSet<Person> treeSet = new TreeSet<>((Person o1, Person o2)->{
            return o1.getName().compareTo(o2.getName());
        });
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);

        System.out.println(treeSet);

        TreeSet<Person> treeSet1 = new TreeSet<>((Person o1, Person o2) -> {
            return o2.getAge() - o1.getAge();
        });
        treeSet1.addAll(treeSet);

        System.out.println(treeSet1);


    }
}
