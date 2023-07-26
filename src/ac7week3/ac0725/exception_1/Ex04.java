package ac7week3.ac0725.exception_1;

/*
        1. throws 없이 사용시
        - countDown(), main() 에서 thy - catch 가 각각 한번씩 발생
        즉, 코드의 가독성을 해치게 된다.

 */


import java.util.InputMismatchException;
import java.util.Scanner;


public class Ex04 {

    static void countDown(int sec) {
        for (int i = sec; i >= 1; i--) {
            System.out.println(i + " 초");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec;

        try {

            System.out.println("몇 초 입니까? ");
            sec = scanner.nextInt();

            countDown(sec);
        } catch (InputMismatchException e) {
            System.out.println("정수 초 단위로 입력해야 합니다.");
        }


        scanner.close();
    }
}
