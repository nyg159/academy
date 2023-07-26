package ac7week1.ac0711.for_1;

import java.util.Scanner;

public class Ex04 {
    /*
    while 문 :   조건식 -> 종속문
    do while 문  종속문 -> 조건문      최초 한번은 꼭 실행 됨
    둘이 순서가 다름
    최초 한번은 사용해야 하는 구문에서 사용 됨
    
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.println("정수 입력(0 : 종료) ");
            n = sc.nextInt();

            System.out.println(n);
        }while (n != 0);

        System.out.println("프로그램 종료");
        sc.close();


    }
}
