package ac7week3.ac0725.exception_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // 예외는 여러가지가 발생할 수 있다.
        Scanner scanner = new Scanner(System.in);
        int n;

        int[] arr = new int[]{10, 20, 30, 40, 50};


        try {
            System.out.print("정수 : ");
            n = scanner.nextInt();

            System.out.println("n = " + n);
            System.out.println("10 / n = " + 10 / n);
            System.out.println("arr[" + n + "] = " + arr[n]);

        } catch (InputMismatchException e) {
            System.err.println("예외 : 정수가 아닙니다.");
        } catch (ArithmeticException e) {
            System.err.println("예외 : " + e.getMessage());
        } catch (Exception e) {
            // Exception : 예외처리의 최상위 클래스
            // 모든 예외를 다 받을 수 있다.
            e.printStackTrace();
            return;
        }finally {
            // finally : 예외 발생 여부에 관계 없이 '무조건' 실행
            // 주로 할당 받은 자원을 해체하는 코드가 자주 사용됨

            System.out.println("\n 스캐너 해제");
            scanner.close();
        }


    }
}
