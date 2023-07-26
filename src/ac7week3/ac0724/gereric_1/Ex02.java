package ac7week3.ac0724.gereric_1;

/*
        간단한 제네릭 실습
        자료형으로 인하여 중복되는 코드 방지를 위해 사용 되면 좋다
        
        
 */

class Box<T> {
    // 인스턴스 생성시 전달한 자료형 타입으로 지정하게 한다. 아무것도 안적으면 Object 로 되어 있다.
    // 자동으로 Object 로 업케스팅 해주고 반환할때 자동으로 다운 케스팅을 해준다.
    private T value;

    Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<Integer>(10); // 이렇게 작성하면 Integer 로 변환하게 한다. 반환형 Integer

        Box<String> b2 = new Box<String>("Java");

        Box<Person> b3 = new Box<Person>(new Person("홍길동", 45));

        Box b4 = new Box(new Person("홍길동", 45));


        System.out.println("b1 값 : " + b1.getValue());

        System.out.println("b2 값 : " + b2.getValue());

        System.out.println("b3 값 : " + b3.getValue());
        System.out.println("b3 값 : " + b3.getValue().getName());

        // 강제로 다운 케스팅을 해줘야 값이 나옴
        System.out.println("b4 값 : " + (Person)b3.getValue());
        System.out.println("b4 값 : " + ((Person) b3.getValue()).getName());



    }
}
