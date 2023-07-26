package ac7week2.ac0721.api_1;

import java.util.Random;
import java.util.Scanner;

/*
        업 다운 게임을 구현
        1. 정답이 될 숫자를 랜덤으로 뽑아둔다
        2. 사용자에게 값을 입력 받아서 정답과 맞는지 검사
        3. 맞으면 정답후 입력 횟수를 출력
        4. 정답보다 작으면 UP, 크면 DOWN 출력
        5. 범위는 아무거나         나는 1~100

 */
public class Quiz01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        int count = 0;
        long start = System.currentTimeMillis()/1000;

        while (true) {

            System.out.print("정수를 입력해 주세요 : ");
            int answer = scanner.nextInt();
            count++;
            if (n == answer) {
                long end = System.currentTimeMillis()/1000;
                long time = end - start;

                System.out.printf("정답입니다. 입력 횟수는 %d 번 입니다. 걸린 시간은 %d 초입니다.",count,time);

                break;

            }else if (n < answer){
                System.out.println("Down");

            } else if (n > answer) {
                System.out.println("UP");

            }else {
                System.out.println("오류 입니다.");
            }
        }
        scanner.close();
    }
}
