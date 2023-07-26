package ac7week1.ac0711.for_1;

import java.util.Scanner;

public class Ex02 {
    /*
    1. 아래 구문을 반복으로 죽여보세요
    2. 1번을 입력문으로 전환후 입력한 구구단을 출력
    3. 역순으로도 출력
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1번문제");
        int a = 1;
        int b = 2;
        int c;
        while (a <= 9){
            c = b * a;
            System.out.println(b + " * " + a + " = " + c);
            a++;

        }

        System.out.println("2번 문제");
        int answer;
        a = 1;
        c = 0;
        System.out.println("구구단을 입력하시오 : ");
        answer = sc.nextInt();

        while (a <= 9){
            c = a * answer;
            System.out.println(answer + " * " + a + " = " + c);
            a++;
        }

        System.out.println("3번 문제");
        a = 9;
        while (a >= 1){
            c = a * answer;
            System.out.println(answer + " * " + a + " = " + c);
            a--;
        }


    }
}
