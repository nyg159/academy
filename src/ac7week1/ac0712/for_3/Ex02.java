package ac7week1.ac0712.for_3;

public class Ex02 {
    /*
            1. 구구단 2단을 단일 반복으로 출력, 단, x1 ~ x9까지만
            2. 1번을 중첩 반복으로 만들어서 2단을 8번 출력한다.
            3. 2번을 조금 수정해서 구구단 2 ~ 9단을 출력한다.
     */
    public static void main(String[] args) {
//        1. 구구단 2단을 단일 반복으로 출력, 단, x1 ~ x9까지만
        System.out.println("1번 문제");
        for(int i = 1; i <= 9; i++){
            System.out.println("2 * "+ i + " = " + 2*i );
        }

//        2. 1번을 중첩 반복으로 만들어서 2단을 8번 출력한다.
        System.out.println("2번 문제");

        for (int j = 1; j < 9; j++){
            for(int i = 1; i <= 9; i++){
                System.out.println("2 * "+ i + " = " + 2*i );
            }
            System.out.println("");
        }

//        3. 2번을 조금 수정해서 구구단 2 ~ 9단을 출력한다.
        System.out.println("3번 문제");
        for (int j = 2; j <= 9; j++){
            for(int i = 1; i <= 9; i++){
                System.out.println(j + " * "+ i + " = " + j * i );
            }
            System.out.println("");
        }




    }
}
