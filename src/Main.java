import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] num = new int[T];
        int[] numA = new int[T];
        int[] numB = new int[T];


        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();

            int B = sc.nextInt();

            if (A > 0 && A < 10 && B > 0 && B < 10) {
                numA[i] = A;
                numB[i] = B;
                num[i] = A + B;
            }
        }

        for (int a = 0; a < T; a++) {
            int x = a + 1;
            System.out.println("Case #" + x + ": "+numA[a] +" + "+numB[a]+" = " + num[a]);
        }
    }
}
