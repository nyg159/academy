package ac7week2.ac0719.inheritance_2;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
        
        /*
            ID, PW를 문자열로 입력 받아서 아래정보와 
            동일하면 로그인 성공을 출력
            하나라도 다르면 로그인 실패
         */
        String id,pw;
        String ID = "itbank";
        String PW = "it";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("아이디를 입력하세요 : ");
        id = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요 : ");
        pw = scanner.nextLine();

        if (ID.equals(id) && PW.equals(pw)) {
            System.out.println("로그인 성공");
            
        } else {
            System.out.println("로그인 실패");

        }

    }
}
