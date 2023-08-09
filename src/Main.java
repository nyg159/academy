import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] A = new int[N];

        if (N >= 1 && N <= 10000 && X >= 1 && X <= 10000) {
            for (int i = 0; i < A.length; i++) {
                int a = scanner.nextInt();
                if (a >= 1 && a <= 10000) {
                    A[i] = a;
                }
            }

            for (int j = 0; j < A.length; j++) {
                if (X > A[j]) {
                    System.out.print(A[j] +" ");
                }

            }
        }
    }
}
