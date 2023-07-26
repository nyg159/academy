package ac7week2.ac0721.api_1;

import java.util.Scanner;

/*
        thread
 */
public class Ex02 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("타이머 세팅(초) : ");
        int n = 0;
        scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i +" 초");

            Thread.sleep(1000);
        }
        System.out.println();

        scanner.close();
    }
}
