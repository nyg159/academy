package ac7week1.ac0711;

import java.util.Scanner;

public class Quiz02 {
    // USB 한 개에 5000원 한다. 그런데 한번에 10개 이상을 구매하면 전체의 10%를 할인해준다.
    // 100개 이상은 전체의 12%를 할인해준다. N개의 USB를 사려면 얼마가 있어야 하는가?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float count, sum, usb = 5000;
        System.out.println("구매할 수량을 입력하시오 : ");
        count = sc.nextInt();

        sum = count * usb;

        // 복합 대입 연산자는 형변환을 왼쪽 변에 맞춰져서 계산한다.
        // 문제를 보고 나눠서 한다.
        if(count >= 100){
            sum = (float) (sum - (sum * 0.12));
            System.out.println("금액은 "+ sum + " 입니다.");
        } else if (count >= 10) {
            sum = (float) (sum - (sum * 0.1));
            System.out.println("금액은 "+ sum + " 입니다.");
        }else {
            System.out.println("금액은 "+ sum + " 입니다.");
        }

    }
}
