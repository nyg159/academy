package ac7week1.ac0710.input_1;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        // 1. 이름, 나이, 신장, 성별을 저장 받을 변수를 선언
        // 단, 성별은 char 로 선언한다
        String name;
        int age;
        double height;
        char gender;

        // 2. 1번의 변수에 Scanner를 활용해서 키보드 값을 입력
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        name = sc.next();

        System.out.print("나이 : ");
        age = sc.nextInt();

        System.out.print("신장 : ");
        height = sc.nextDouble();

        System.out.print("성별 : ");
        gender = sc.next().charAt(0);


        // 3. 결과는 아래와 같이 출력
        // 결과)
        // 이름 : 홍길동 (21세, 남)
        // 신장 : 175.3cm

        System.out.printf("\n이름 : %s (%d세, %c)\n", name, age ,gender);
        System.out.println("신장 : " + height + "cm");

        sc.close();
    }
}
