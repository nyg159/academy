package ac7week1.ac0712.for_3;

import java.util.Scanner;

public class Quiz02 {
    /*
            핵심은 출력하는 별표의 세로 가로줄의 for 문을 알고 사용 할 줄 알아야 한다.

            정수를 입력받아서
            1. ㅁ 찍기 테두리만 찍기( *로)
            2. +  찍기 십자가 모양으로 출력하기 ( 홀수)
            3. x  모양으로 출력하기 (홀수)
            4. z  모양으로 출력하기

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하시오 : ");
        int n = scanner.nextInt();

        //1. ㅁ 찍기 테두리만 찍기( *로)
        System.out.println("1번 문제");
        for (int i = 0; i < n; i++){
            if(i==0 || i == n-1){
                for (int j = 0; j < n; j++){
                    System.out.print("*");
                }

            }else{
                for(int h = 0; h < n; h++){
                    if(h==0 || h == n-1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }

                }
            }
            System.out.println("");
        }

//        2. +  찍기 십자가 모양으로 출력하기 ( 홀수)
        System.out.println("2번 문제");

        for (int i = 0; i < 5; i++){
            if(i != 5 - 2 ){
                for (int j = 0; j < 5 - 3; j++){
                    System.out.print("0");
                }
            }
            if(i != 5-3){
                for(int a = 0; a < 5; a++){
                    System.out.print("*");
                }
            }else {
                for (int b = 0; b < 5 - 4; b++){
                    System.out.print("*");
                }

            }
            System.out.println("");


        }

    }
}
