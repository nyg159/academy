package ac7week3.ac0724.gereric_1;

/*
        1
 */

class Po<T> {

    private T value;
    private T value2;


    Po(T value, T value2) {
        this.value = value;
        this.value2 = value2;
    }

    public T getValue() {
        return value;
    }

    public T getValue2() {
        return value2;
    }
}
public class Quiz01 {
    public static void main(String[] args) {
        /*
            아래 코드가 동작하게 클래스를 작성
         */

        Po<Integer> p1 = new Po<Integer>(5, 3);
        Po<Double> p2 = new Po<Double>(3.14, 6.79);
        Po<String> p3 = new Po<String>("Java", "1.8");

        System.out.println("p1 = " + p1.getValue() + ", " + p1.getValue2());
        System.out.println("p2 = " + p2.getValue() + ", " + p2.getValue2());
        System.out.println("p3 = " + p3.getValue() + ", " + p3.getValue2());
    }
}
