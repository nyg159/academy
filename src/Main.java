import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 1 && a <= 100) {
            for (int j = 0; j < a; j++) {
                for (int i = 0; i < a - j - 1; i++) {
                    System.out.print(" ");
                }

                for (int k = 0; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();

            }

        }

    }
}
