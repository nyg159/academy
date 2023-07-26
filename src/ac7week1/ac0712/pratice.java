package ac7week1.ac0712;

import java.util.Scanner;

/*
            핵심은 출력하는 별표의 세로 가로줄의 for 문을 알고 사용 할 줄 알아야 한다.

            1. 피라미드  입력 : 5
                   *
                  ***
                 *****
                *******
               *********

             2. 피라미드 반전  입력 : 5
                    *********
                     *******
                      *****
                       ***
                        *
            정수를 입력받아서
            3. ㅁ 찍기 테두리만 찍기( *로)
            4. +  찍기 십자가 모양으로 출력하기 ( 홀수)
            5. x  모양으로 출력하기 (홀수)
            6. z  모양으로 출력하기

     */
public class pratice {

    static void problem_1(int n1){

//        1. 피라미드  입력 : 5
//                *
//                  ***
//                 *****
//                *******
//               *********


        for (int i = 0; i < n1; i++) {
            for (int j = 0; i < n1; j++) {

            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1번 문제 피라미드 층을 입력해주세요 : ");
        int n = scanner.nextInt();
        problem_1(n);

        
        

    }
}
