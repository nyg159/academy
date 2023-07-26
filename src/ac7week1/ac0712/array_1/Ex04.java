package ac7week1.ac0712.array_1;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        // 배열과 같이 사용하면 좋은 클래스가 있다.
        // 배열은 초기화 하지 않으면 자동으로 기본값으로 초기화 한다.

        boolean[] bas = new boolean[2];
        char[] chars = new char[5];
        int[] ints = new int[8];
        double[] doubles = new  double[3];
        String[] strings = new  String[6];

        System.out.println("ints = " + Arrays.toString(ints));
        System.out.println("bas = " + Arrays.toString(bas));
        System.out.println("strings = " + Arrays.toString(strings));

    }
}
