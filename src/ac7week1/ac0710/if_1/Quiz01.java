package ac7week1.ac0710.if_1;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        // 1. 정수를 입력 받아서 절대값을 출력
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("1. 절대값 : ");
        n = sc.nextInt();

        if (n < 0) { n *= -1; }

        System.out.println("n = " + n);


        // 2. 정수를 입력 받아서 3과 5의 공배수인지 판별
        String result = "3의 배수 아님";

        if (n % 3 == 0 && n % 5 == 0) 	{ result = "3과 5의 공배수"; }
        else if (n % 3 == 0) 			{ result = "5의 배수 아님"; }

        System.out.println(result);


        // 3. 세 정수를 입력 받아서 가장 큰 수를 출력
        int n1, n2, n3;
        int max;

        System.out.print("\n3. 세 정수 입력 : ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        max = n1;

        if (max < n2) { max = n2; }
        if (max < n3) { max = n3; }

        System.out.println("최대값 : " + max);

        sc.close();
    }
}
