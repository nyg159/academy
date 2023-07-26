package ac7week3.ac0724.gereric_1;


class Point<T1, T2> {
    private T1 x;
    private T2 y;

    Point(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%s, %s)", x, y);
    }

}

public class Ex03 {
    public static void main(String[] args) {
//        Point<Integer, Double> p1 = new Point<Integer, Double>(5, 3.14);
        Point<Integer, Double> p1 = new Point<>(5, 3.14);
        Point<Double, Integer> p2 = new Point<>(3.14, 5);


        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

    }
}
