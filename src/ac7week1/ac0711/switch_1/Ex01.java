package ac7week1.ac0711.switch_1;

import java.util.Scanner;

public class Ex01 {
    /* switch ~ case 
    * 조선이 아닌 값으로 코드를 분기한다.
    * 값에 따라 실행할 구문이 선택되기 대문에 선택문 이라고 한다.
    * 주로 메뉴 작성에 자주 사용된다.
    * 
    *  switch 문은 전부 if로 구현 가능
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menu;

        System.out.println("매뉴 (1 ~ 3) ");
        menu = sc.nextInt();

        // 스위치 문은 점프를 한다.

        switch (menu){  // switch 의 값으로 정수나 문자열만 가능
            case 1:
                System.out.println("1번을 선택");
                break;

            case 2:
                System.out.println("2번을 선택");
                break;

            case 3:
                System.out.println("3번을 선택");
                break;
            
                
            default:
                // default 는 case 에 없는걸 출력 하고 싶을 때
                // 가장 밑에 사용하는걸 권장 위에 사용해도 상관없는데 대신 break 사용해야함
                System.out.println("부적합한 매뉴 입니다.");
        }

        System.out.println("\n프로그램 종료");
        sc.close();
    }
}
