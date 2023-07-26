package ac7week2.ac0720.abstract_1;

import other.Animal;

class Cat extends Animal{

    @Override
    public void bark() {
        System.out.println("야옹");
    }
}

class Dog extends Animal {

    @Override
    public void bark() {
        System.out.println("멍멍");

    }
}
public class Ex02 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal[] animals = new Animal[]{cat, dog};
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat("사료");   // 동일하게 실행

            animals[i].bark();          // 자식클래스 마다 다르게 실행

        }
    }
}
