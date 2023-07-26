package ac7week1.ac0714.methode_2;

/*
            하노이 탑
 */
public class Ex04 {


    static void hanoiMove(int n, char src, char sub, char dst){
        // 원판갯수, 출발지, 보조, 도착지

        if (n == 1) {
            System.out.printf("원판 %d : %c -> %c\n", n, src, dst);
            return;
        }

        hanoiMove(n - 1, src, dst, sub);

        System.out.printf("원판 %d : %c -> %c\n", n, src, dst);

        hanoiMove(n - 1, sub, src, dst);

    }
    public static void main(String[] args) {

        hanoiMove(1, 'A', 'B', 'C');

        System.out.println();
        hanoiMove(2, 'A', 'B', 'C');

        System.out.println();
        hanoiMove(3, 'A', 'B', 'C');

        System.out.println();
        hanoiMove(4, 'A', 'B', 'C');


    }
}
