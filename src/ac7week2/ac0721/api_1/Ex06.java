package ac7week2.ac0721.api_1;

/*
        Random 클래스

 */

import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {

        Random ran = new Random();
//        1. 0 에서 9까지
        for (int i = 0; i < 10; i++) {  // nextInt(n) : 0 ~ (n-1) 사이의 무작위 정수를 반환

            int n = ran.nextInt(10);

            System.out.println(n);

        }
        System.out.println();
//        2. 1 ~ 10 까지
        for (int i = 0; i < 10; i++) {
            int num = ran.nextInt(10)+1;    // (0 ~ 9) + 1 -> 1 ~ 10 된다

            System.out.println(num);
        }
        System.out.println();

//        3. 5 ~ 15 까지
        for (int i = 0; i < 10; i++) {
            int number = ran.nextInt(10) + 5;
            System.out.println(number);
        }
        System.out.println();
    }
}
