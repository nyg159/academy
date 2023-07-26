package ac7week2.ac0721.api_1;

import java.util.Scanner;

/*
        현재 시간
 */
public class Ex04 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println("현재 시간 : "+ time);                              // 밀리초
        System.out.println("시간 : " + time / 1000);                          // 초
        System.out.println("시간 : " + time / 1000 / 60);                     // 분
        System.out.println("시간 : " + time / 1000 / 60 / 60);                // 시간
        System.out.println("시간 : " + time / 100 / 60 / 60 / 24);            // 일
        System.out.println("시간 : " + time / 1000 / 60 / 60 / 24 / 365.25);  // 년
        // 유닉스 시간 : 1970 년대 부터 1초씩 세고 있는 시간

        // 시작 시간과 종료 시간의 차이는 소요 시간이다.
        // 즉, 소요 = 종료 - 시작

        Scanner scanner = new Scanner(System.in);
        String word;

        long start = System.currentTimeMillis();

        System.out.println("Hello World Welcome to Java");
        word = scanner.nextLine();

        long end = System.currentTimeMillis();

        System.out.printf("총 소요시간 : %d 초 ", (end - start) / 1000);

        scanner.close();
    }
}
