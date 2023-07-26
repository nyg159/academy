package ac7week3.ac0725.exception_1;

/*
         정수를 입력 받아서 화면에 그대로 출력
         단 정수가 아니면 사용자에게 다시 입력 받도록 한다.
         재입력시 정수가 맞으면 출력 후 종료
         
         Buffer 가 뭐였는지 생각해 보세요
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){

            try {
                System.out.print("정수를 입력하세요 : ");
                int n = scanner.nextInt();
                System.out.println("입력 받은 정수는 " + n + " 입니다.");

                break;

            } catch (InputMismatchException e) {
                System.err.println("예외 : 정수가 아닙니다.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
