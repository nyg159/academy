package ac7week2.ac0720.abstract_1;

import other.Animal;
import other.Flyable;
/*
        자바는 클래스 다중 상속이 불가능
        왜냐면 1. 충돌이 일어남
        2. 다중 상속의 상위 클라스가 같을 경우 중복 상속을 받는다.
        - 기능을 많이 물려 받아서 강력한 상속이다.
        - 하지만 충돌을 많이 발생하기 때문에 안정성을 해친다.
        
        
        클래스 상속      : 기능을 물려 받아서 '확장'에 종점
        인터페이스 상속   : 특정 기능을 '구현'에 중점

 */

class Bird extends Animal implements Flyable {  // Flyable 인터페이스 상속

    @Override
    public void bark() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
//        type ="꼬리";       변경이 불가능
        System.out.println(type + "로 난다.");
    }
}

class Airplain implements Flyable {


    @Override
    public void fly() {
        System.out.println("엔진의 가속으로 날아간다.");
    }
}
public class Ex03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Airplain airplain = new Airplain();
        
        // 동물 친구들 모여라~   이런 느낌    업 케스팅
        Animal[] animals = new Animal[]{cat, dog, bird};
        for (int i = 0; i < animals.length; i++) {
            animals[i].bark();
        }
        System.out.println();

        // Animal 로 업케스팅 하면 interface 꺼를 사용 불가
        // interface 로 업케스팅 하면 Animal 꺼도 사용 불가
        
        // 날 수 있는 친구들 모여라~~  업케스팅
        Flyable[] flyable = new Flyable[]{bird, airplain};

        for (int i = 0; i < flyable.length; i++) {
            flyable[i].fly();
        }
       
        // 여기서 bird 를 살펴보면
        // Animal 을 상속받아서 Animal 로 업케스팅이 가능하고
        // Flyable 을 상속 받아서 Flyable 로도 업케스팅이 가능함
    }
}
