package ac7week3.ac0725.exception_1;

/*
        예외 클래스는 직접 만들어서 사용할 수도 있음
        단, Java 에는 이미 존재하는 예외 클래스가 많아서 잘 만들어 사용하지 않음
        
 */

import java.util.Scanner;

class myException extends Exception{
    private static final long serialVersionUID = 123456L;
    // 자바 직렬화 관련 있음

    myException(String msg) {
        super(msg);
    }


}

public class Ex06 {
    // throws : 예외를 전가 하겠다
    // throw : 예외를 발생 시키겠다.
    static int total(int n) throws myException {
        if (n <= 0) {
            throw new myException("음수 입니다.");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("양수 입력 :" );
        n = scanner.nextInt();

        int sum = 0;
        try {
            sum = total(n);
        } catch (myException e) {
            System.err.println("예외 : "+ e.getMessage());
        }

        System.out.println("1 ~ " + n + " 까지 합 : " + sum);

        scanner.close();


    }
}
