package ac7week3.ac0725.exception_1;

/*
        2. throws 사용시
        main 한 곳에서 try - catch 로 예외를 모두 처리
        try - catch 문의 개수가 줄어들어 가독성 확보에 도움된다.
        발생하는 예외가 많을수록 효과적이다.


*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {

    static void countDown(int sec) throws InterruptedException{
        for (int i = sec; i >= 1; i--) {
            System.out.println(i + " 초");
            Thread.sleep(1000);
        }
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

        } catch (Exception e) {
            System.err.println("예외 : "+e.getMessage());
        }


        scanner.close();



    }
}
