package ac7week3.ac0724.collection_1;

import java.util.Iterator;
import java.util.LinkedList;

/*
        1. Person 클래스를 작성합니다. 메서드는 마음대로 필드는 이름, 나이
        2. 1번의 클래스 객체를 3개 정도 생성
        3. 2번의 객체를 리스트에 순서대로 추가
        4. iterator 를 사용하여 반복하여 모두 출력
        5. 이름 순으로 오름차순 후 출력
        6. 나이 순으로 내림차순 후 출력
 */
class Person {
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
}

public class Quiz01 {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 87);
        Person p2 = new Person("안중근", 45);
        Person p3 = new Person("김순신", 23);

        LinkedList<Person> list = new LinkedList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(new Person("박진수", 19));    // 이렇게 생성 해도 됨

        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            Person person = it.next();
            System.out.print("( "+person.getName()+" "+person.getAge() + " 세) ");
        }
        System.out.println();

        it = list.iterator();   // iterator 초기화

        list.sort((Person o1 , Person o2)->{
            return o1.getName().compareTo(o2.getName());
        });
        System.out.print("사람이름 오름차순 : ");
        while (it.hasNext()) {
            Person person = it.next();
            System.out.print("( "+person.getName()+" "+person.getAge() + " 세) ");
        }
        System.out.println();

        it = list.iterator();
        list.sort((Person o1 , Person o2)->{
            return o2.getAge() - o1.getAge();
        });
        System.out.print("사람나이 내림차순 : ");
        while (it.hasNext()) {
            Person person = it.next();
            System.out.print("( "+person.getName()+" "+person.getAge() + " 세) ");
        }
    }
}
