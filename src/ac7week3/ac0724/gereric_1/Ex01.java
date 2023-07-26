package ac7week3.ac0724.gereric_1;

/*
        제네릭 프로그래밍
        - 자료형에 구애 받지 않는 프로그래밍 방식
        - 자료형을 일반화하는 방식을 제공
        - 원리는 object 로 업케스팅 받아서 사용시 자동을 다운 케스팅을 해준다.

 */


class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "(" + age + " 세)";
    }

    public String getName() {
        return name;
    }
}
public class Ex01 {
    static <T> void printArr(T[] arr) {     // 기본 자료형은 제네릭올 받을 수 없다.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//    static <T> void printArr1(Object[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//
//        }
//
//    }


    public static void main(String[] args) {
        int[] arr1 = new int[]{10, 20, 30, 40, 50};
        Integer[] arr2 = new Integer[]{10, 20, 30, 40, 50};
        Double[] arr3 = new Double[]{3.14, 5.9, 6.123};
        String[] arr4 = new String[]{"Java", "Python"};

        Person[] arr5 = new Person[]{
                new Person("홍길동", 33),
                new Person("김민지", 25)
        };

//        printArr(arr1);     // 기본 자료형은 제네릭으로 받을 수 없다. wrapper 형만 제네릭 가능
        printArr(arr2);
        printArr(arr3);
        printArr(arr4);
        printArr(arr5);         // 해쉬코드로 출력이 된다.    제대로 출력을 하고 싶다면 toString 을 오버라이드 하면 된다.







    }

}
