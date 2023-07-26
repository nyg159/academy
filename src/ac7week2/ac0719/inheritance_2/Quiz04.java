package ac7week2.ac0719.inheritance_2;
/*
        사용자에게 ID PW 를 입력 받아서 위에 생성해둔 계정과 비교
        일치하는 계정이 있으면 로그인 성공, 없으면 실패
        같은 index 의 데이터가 한 쌍의 계정 정보

        static String[] ids = new String[]{"itbank", "root", "user"};
        static String[] pws = new String[]{"it", "qwe", "1234"};
 */


import java.util.Scanner;

public class Quiz04 {
    static String[] ids = new String[]{"itbank", "root", "user"};
    static String[] pws = new String[]{"it", "qwe", "1234"};


    static String login(String id, String pw) {
        int idIndex,pwIndex;
        String msg;
        for (int i = 0; i < ids.length; i++) {

            boolean sameId = ids[i].equals(id);
            boolean samePw = pws[i].equals(pw);
            if (sameId && samePw) {       // 가독성을 위해 변수로 지정해서 사용하는게 좋다
                msg = "로그인 성공";
                return msg;                 // 변수로 넣어서 리턴 해도 되고  그냥 바로 문자열로 리턴해도 된다.
            }
        }
        return "로그인 실패";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id,pw;
        System.out.print("아이디를 입력해주세요 :");
        id = scanner.next();

        System.out.print("비밀번호를 입력해주세요 :");
        pw = scanner.next();

        System.out.println(login(id,pw));

    }
}
