package ac7week1.ac0710.input_1;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        // 1. 이름, 나이, 신장, 주소를 입력 받을 변수를 선언
        String name, address;
        int age;
        double height;

        // 2. 1번의 변수에 데이터를 입력 받는다
        // 단, 주소는 맨 마지막에 입력할 것
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        name = sc.next();

        System.out.print("나이 : ");
        age = sc.nextInt();

        System.out.print("신장 : ");
        height = sc.nextDouble();

        sc.nextLine();

        System.out.print("주소 : ");
        address = sc.nextLine();

        // 3. 아래와 같이 출력
        // 결과)
        // 이름 : 홍길동 (36세)
        // 신장 : 168.7cm
        // 주소 : 부산 광역시 해운대구 센텀

        System.out.printf("\n이름 : %s (%d세)\n", name, age);
        System.out.println("신장 : " + height + "cm");
        System.out.println("주소 : " + address);

        sc.close();
    }
}
