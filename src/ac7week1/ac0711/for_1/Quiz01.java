package ac7week1.ac0711.for_1;

import java.util.Scanner;

public class Quiz01 {
    /*
    1. 정수를 입력 받아서 1 ~ n 까지 일렬로 출력
    ex) 입력 : 5 -> 1 2 3 4 5

    2. 1번을 역순으로

    3. 정수를 입력 받아서 1 ~ n 까지 합계 (= 누적합)

    4. 정수를 입력 받아서 1~ n 까지 곱 (= 누적곱)

    5. 점수를 입력 받아서 거꾸로 출력
    ex) 입력 : 123 - > 출력 : 321
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1, a2 = 0;
        int sum = 0;

        System.out.println("1번 문제");
        System.out.println("정수를 입력하시오. : ");

        a1 = sc.nextInt();

        while (a1 > 0){
            a2++;
            System.out.print(a2 + " ");
            a1--;

        }



        System.out.println("\n2번 문제");

        while (a1 > 0){
            System.out.print(a1 + " ");
            a1--;
        }

        System.out.println("\n3번 문제");

        int a = 0, n = 0;

        while (true){
            System.out.println("정수를 입력하시오. : ");
            n = sc.nextInt();
            if(n == 0){
                System.out.println("프로그램 종료");
                break;
            }
            sum += n;
            System.out.println(a);
        }


        System.out.println("\n4번 문제");
        int h = 1, k;

        while (true){
            System.out.println("정수를 입력하시오. : ");
            k = sc.nextInt();
            if(k == 0){
                System.out.println("프로그램 종료");
                break;
            }
            h *= k;
            System.out.println(h);
        }


        // 이건 나중에 다시 풀어 보자 답이 정수로 추출해보자
        
        System.out.println("\n5번 문제");
        String n1;
        System.out.println("정수를 입력하시오. : ");
        n1 = sc.next();
        int n4 = n1.length();
        while (n4 > 0){
            n4--;
            System.out.print(n1.charAt(n4));
        }


    }

















}
