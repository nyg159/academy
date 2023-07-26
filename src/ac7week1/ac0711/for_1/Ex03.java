package ac7week1.ac0711.for_1;

import java.util.Scanner;

public class Ex03 {
    /*
    반복문의 종류
    1. 지정 횟수 반복       횟수가 정해진 반복
    2. 불특정 횟수 반복        마땅히 횟수가 없는 반복 :  ex) 특정 값이 나올때 까지 등등
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 1;

        while (n != 0){
            System.out.println("정수 입력(0 : 종료)");
            n = sc.nextInt();
            System.out.println(n);
        }
        System.out.println("프로그램 종료");
        sc.close();




    }
}
