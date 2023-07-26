import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        a = sc.nextInt();



        for (int i = 0; i < a; i++) {
            int sum = 0;
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.printf("Case #%d : %d + %d = %d\n",i,b,c,sum);
        }
    }
}