package ac7week1.ac0712.for_2;

import java.util.Scanner;

/*
        아래의 문제들은 for 문으로 해결한다.
        1. 정수를 입력 받아서 1~ n 까지 일렬로 출력
        입력 : 6 -> 출력 1 2 3 4 5 6
        
        2. 정수를 입력 받아서 약수를 출력
        입력 : 6 -> 출력 : 1 2 3 6 
        
        3. 정수를 입력 받아서 소수인지 판별
        입력 : 6 -> 출력 : 소수 아님
 */
public class Quiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 받은 정수를 1 ~ 받은 정수 까지 출력
        System.out.println("1번 문제");
        System.out.println("정수를 입력하시오 : ");
        int n = sc.nextInt();

        for(int i = 1; i < n + 1; i++){
            System.out.print(i + " ");
        }

        // 받은 정수의 약수 출력
        System.out.println("2번 문제");
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i ==0){
                System.out.print(i + " ");
                count += 1;
            }
        }

        // 받은 정수의 소수 인지 아닌지 판별
        System.out.println("3번 문제");
        if(count == 2){
            System.out.printf("%d 는 소수입니다. ", n);
        }else {
            System.out.printf("%d 는 소수가 아닙니다.", n);
        }

        

    }
}
