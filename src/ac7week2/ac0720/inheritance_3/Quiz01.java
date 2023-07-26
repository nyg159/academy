package ac7week2.ac0720.inheritance_3;
/*
        다시 해보자!!!!!
        계정 정보를 이용해서 클래스로 구현하여 로그인을 구현
 */

import java.util.Scanner;

import static ac7week2.ac0720.inheritance_3.Quiz01.dbs;

class User {
    private String id, pw, nick;


    User(String id, String pw, String nick) {
        this.id = id;
        this.pw = pw;
        this.nick = nick;
    }
    User(String userId, String userPw) {                            // 메서드를 사용하지 않고 생성자로 구현 했음
        // this() : 다른 생성자 호출
        // this.맴버 : 필드나 메서드 호출
        for (int i = 0; i < dbs.length; i++) {
            if (dbs[i].id.equals(userId) && dbs[i].pw.equals(userPw)) {
                System.out.println("로그인 성공 " + dbs[i].nick + " 님이 로그인 하셨습니다.");

            } else {
                System.out.println("로그인 정보가 일치 하지 않습니다.");
            }
        }
    }
    
    public int hashCode(){
            return 0;
    }

    public boolean equals(Object obj) {
        return true;
    }
}




public class Quiz01 {
    static User[] dbs = new User[]{
            new User("itbank", "it", "이뱅"),
            new User("root", "qwe", "관리자"),
            new User("user","1234","유저")
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userid, userpw;

        System.out.print("아이디를 입력해주세요 :");
        userid = scanner.next();

        System.out.print("비밀번호를 입력해주세요 :");
        userpw = scanner.next();


        User user = new User(userid,userpw);




        scanner.close();
    }
}
