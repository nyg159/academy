package ac7week1.ac0714.methode_2;

/*
        재귀 (recursive) : 다시 되돌아오다.
        재귀함수 : 재귀를 함수로 구현한 것
        - 함수 내에서 자신을 호출해서 구현됨
        - 파이썬 튜터로 재귀 함수 공부
        재귀는 종료가 될 조건이 꼭 필요하다.
 */
public class Ex02 {

    static void func(int n) {           // 재귀 전

        if (n == 0) {
            return;         // 리턴은 함수를 종료하는 것
        }

        System.out.print(n + " ");          // 재귀 전

        func(n -1);                      // 재귀 발생

        System.out.print(n + " ");          // 재귀 후
    }


    public static void main(String[] args) {
        for (int i = 3; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        func(3);
    }



}
