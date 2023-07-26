package ac7week1.ac0714.methode_2;



public class Ex03 {
    // 재귀 함수의 특징은 왕복!!!! 갔다가 돌아오는 것

    static int total(int n) {
        if (n == 1) {
            return 1;
        }
        System.out.println(n);
        return n + total(n - 1);        // 1번
//        return 3 + total(2)              // 2번
//                return 2 + total(1)      // 3번
    }

    static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        System.out.println(n);
        return n * fac(n - 1);

    }

    static int pow(int n, int m) {
        if (m == 0) {
            return 1;
        }
        return n * pow(n, m - 1);
    }


    public static void main(String[] args) {
        System.out.println("total(3) = " + total(3));
        System.out.println("total(10) = " + total(10));

        // 연습문제
        System.out.println("fac(5) = " + fac(5));

        //연습문제 2
        System.out.println("pow(2, 10) = " + pow(2, 10));




    }
}
