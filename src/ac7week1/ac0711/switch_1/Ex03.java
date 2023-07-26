package ac7week1.ac0711.switch_1;

import java.util.Scanner;

public class Ex03 {

    /*
    * java 의 swich 문은 문자열을 사용할 수 있다.
    *
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String menu;

        System.out.println("-------------- 매뉴 ----------------");
        System.out.println("             1. 짜장면");
        System.out.println("             2. 돈까스");
        System.out.println("             3. 짬뽕");
        System.out.println("             4. 볶음밥");
        System.out.println("             5. 쌀국수");

        System.out.println(">>> ");
        menu = sc.next();
        
        switch (menu){
            case "짜장면": case "1":
                System.out.println("짜장면 주문이요");
                break;
            case "돈까스": case "2":
                System.out.println("돈까스 주문이요");
                break;
            case "짬뽕": case "3":
                System.out.println("짬뽕주문이요");
                break;
            case "볶음밥": case "4":
                System.out.println("볶음밥 주문이요");
                break;
            case "쌀국수": case "5":
                System.out.println("쌀국수 주문이요");
                break;
            default:
                System.out.println("없는 매뉴입니다.");
        }
        
        
    }
}
