package ac7week1.ac0710.if_1;

/*
	현재 건물에는 엘리베이터 3대가 있다
	건물은 지하가 없고 1 ~ 15층까지 있다
	A는 4층에 B는 9층에 C는 12층에 머물러 있다
	사용자에게 현재 층 수를 입력 받아서 가까운 엘리베이터를 호출하라
*/

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int A = rd.nextInt(15) + 1;		// nextInt(n)
        int B = rd.nextInt(15) + 1;		// - 0 ~ (n - 1) 사이의 무작위 수를 반환
        int C = rd.nextInt(15) + 1;
        int cur;

        System.out.printf("엘베) A = %d, B = %d, C = %d\n", A, B, C);
        System.out.print("현재 층 수? ");
        cur = sc.nextInt();

        // 1. 절대값
        int disA = Math.abs(cur - A);	// abs()는 전달한 데이터를 절대값으로 반환
        int disB = Math.abs(cur - B);
        int disC = Math.abs(cur - C);


        char name = 'A';
        int min = disA;

        // 2. 최소값
        if (min > disB) {
            min = disB;
            name = 'B';
        }
        if (min > disC) {
            min = disC;
            name = 'C';
        }

        System.out.println("가장 가까운 " + name + "엘리베이터를 호출");

        sc.close();

    }
}
