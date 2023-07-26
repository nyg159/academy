package ac7week1.ac0712.for_2;

import java.util.Scanner;

public class Quiz02 {
    /*
        1. 1 ~ 1000 까지의 합을 구하시오
        2. 1 ~ 1000 까지의 합을 구하시오 (단, 3의 배수는 제외)
        3. 1 ~ 1000 까지의 합을 구하시오 (단, 3의 배수는 제외, 3의 배수이면서 5의 배수는 합에 포함)
        4. 입력 받은 값의 약소와 약수 개수를 출력
        5. 입력 받은 수가 소수인지 판별하여 출력
        6. Factorial 을 구현 5! -> 5*4*3*2*1 = 120

     */
    public static void main(String[] args) {
//        1. 1 ~ 1000 까지의 합을 구하시오
        int count = 0, count_2 = 0, count_3 = 0;
        System.out.println("1번 문제");
        for(int i = 0; i <= 1000; i++ ){
            count += i;
        }
        System.out.println("1 ~ 1000 까지의 합 : " + count);

        //2. 1 ~ 1000 까지의 합을 구하시오 (단, 3의 배수는 제외)
        System.out.println("2번 문제");
        for(int i = 0; i <= 1000; i++ ){
            if(i % 3 != 0){
                count_2 += i;
            }
        }
        System.out.println("1 ~ 1000 까지의 합(단, 3의 배수는 제외) : " + count_2);

//        3. 1 ~ 1000 까지의 합을 구하시오 (단, 3의 배수는 제외, 3의 배수이면서 5의 배수는 합에 포함)
        System.out.println("3번 문제");

        for(int i = 0; i <= 1000; i++ ){

            if(i % 3 == 0 ){
                if(i % 5 == 0){
                    count_3 += i;
                    System.out.println(count_3);
                }
            }else {
                count_3 += i;
                System.out.println(count_3);
            }
        }
        System.out.println("1 ~ 1000 까지의 합(단, 3의 배수는 제외, " +
                "3의 배수이면서 5의 배수는 합에 포함) : " + count_3);


//        4. 입력 받은 값의 약소와 약수 개수를 출력
        System.out.println("4번 문제");
        System.out.print("정수를 입력하세요. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countUp = 0, m, j = 1;
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
                countUp += 1;
            }
        }
        System.out.println("입력받은 약수 갯수는 : " + countUp);

//        5. 입력 받은 수가 소수인지 판별하여 출력
        System.out.println("5번 문제");
        if(countUp == 2){
            System.out.println(n + " 은 소수 입니다.");
        }else {
            System.out.println(n + " 은 소수가 아닙니다.");
        }

//        6. Factorial 을 구현 5! -> 5*4*3*2*1 = 120
        System.out.println("6번 문제");
        m = n;
        for(int i = 1; i < n; i++){
            if (i != n) {
                System.out.print(m + " * ");
                j = j * m;
                m = n - i;

            }
        }
        System.out.print("1 = " + j);
    }
}
