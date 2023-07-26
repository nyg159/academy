package ac7week1.ac0711.switch_1;

import java.util.Scanner;

public class Ex02 {
//    swich 문은 범위 조건 처리가 어렵거나 불가능하다.
//        결론은 조건으로 저리시엔 if, 값으로 처리시엔 swich 가 유리

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("상수 입력 (1 ~ 10)");
        n = sc.nextInt();
        
        // 이렇게 사용도 가능함
        switch (n){
            
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("홀수");
                break;

            case 2: case 4: case 6: case 8: case 10:
                System.out.println("짝수");
                break;
        }






    }
}
