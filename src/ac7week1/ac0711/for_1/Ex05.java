package ac7week1.ac0711.for_1;


import java.util.Scanner;

/*
    불특정 획수 반복은 무한 반복 형태로 사용하기도 한다.
    무한 반복

 */
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n;

        while (true){
            System.out.println("정수 입력( 0 : 종료 )");

            n = sc.nextInt();
            if(n == 0){
                break;
            }

            System.out.println("n + " + n + "\n");

        }

        sc.close();
    }
}
