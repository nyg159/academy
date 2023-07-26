package ac7week1.ac0712.for_3;

import java.util.Scanner;

public class Quiz01 {
    /*
            별찍기
            1. n X n 찍기 입력한 숫자 만큼 별 출력
            2. 입력 받은 수 만큼 차례로 출력 시킨다.
            *
            **
            ***
            ****
            *****

            3. 2번 문제를 반전 시킨다

            4. 2번을 좌우 반전
            입력 : 5
                *
               **
              ***
             ****
            *****

            5. 4번은 위 아래 반전 시킨다.

            ******
             *****
               ***
                **
                 *

            6. 피라미드  입력 : 5
                   *
                  ***
                 *****
                *******
               *********

             7. 피라미드 반전  입력 : 5
                    *********
                     *******
                      *****
                       ***
                        *

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1. n X n 찍기 입력한 숫자 만큼 별 출력
        System.out.println("1번 문제");
        System.out.print("정수를 입력하시오 : ");
        int n = sc.nextInt();

        for(int j = 1; j <= n; j++){
            for(int i = 1; i <= n; i++){
                System.out.print("*");
            }
            System.out.println("");
        }


//        2. 입력 받은 수 만큼 차례로 출력 시킨다.
//            *
//            **
//            ***
//            ****
//            *****
        System.out.println("2번 문제");

        for(int j = 1; j <= n; j++){
            for(int i = 1; i <= j; i++){
                System.out.print("*");
            }
            System.out.println("");
        }

//        3. 2번 문제를 반전 시킨다
        System.out.println("3번 문제");


        for(int j = n; j >= 0; j--){
            for(int i = 1; i <= j; i++){
                System.out.print("*");
            }
            System.out.println("");
        }


//        4. 2번을 좌우 반전
//        입력 : 5
//                *
//               **
//              ***
//             ****
//            *****
        System.out.println("4번 문제");
        int count = n ;

        for(int j = 1; j <= n; j++){
            for(int i = count; i >= 0; i--){
                System.out.print(" ");

            }
            count -= 1;
            for(int a = 1; a <= j; a++){
                System.out.print("*");
            }

            System.out.println("");
        }

//        5. 4번은 위 아래 반전 시킨다.
//
//            ******
//             *****
//               ***
//                **
//                 *
        System.out.println("5번 문제");
        int count_1 = n ;

        for(int j = 1; j <= n; j++){
            for(int i = 1; i <= j; i++){
                System.out.print(" ");

            }

            for(int a = count_1; a >= 1; a--){
                System.out.print("*");
            }
            count_1 -= 1;
            System.out.println("");
        }
        // 선생님이 푼것
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i ; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("");







//        6. 피라미드  입력 : 5
//                   *
//                  ***
//                 *****
//                *******
//               *********
        System.out.println("6번 문제");
        int count_3 = n ;
        int ab = 1;

        for(int j = 1; j <= n; j++){
            for(int i = count_3; i > 0; i--){
                System.out.print(" ");

            }
            count_3 -= 1;

            if(ab % 2 != 0){
                for(int a = 1; a <= ab; a++){
                System.out.print("*");
                }
            }
            ab += 2;
            System.out.println("");
        }










//        7. 피라미드 반전  입력 : 5
//                *********
//                 *******
//                  ****
//                   ***
//                    *

        System.out.println("7번 문제");
        // 나중에 풀어보자







    }
}
