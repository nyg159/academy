package other;

public class Funcs {

    public static int abs(int ab) {
        if (ab < 0) {
            ab = ab * -1;
            return ab;
        }
        return ab;
    }

    public static String toString(int[] n) {
        String msg = "[ ";
        int i ;
        for (i = 0; i < n.length - 1; i++) {
            System.out.print(n[i]+" ");
            msg += n[i] + ", ";
        }
        msg += n[i] +" ]";
        return msg;
    }

    public static int arrTotal(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        return sum;
    }

    public static int arrMax(int[] n) {
        int max= 0;
        for (int i = 0; i < n.length; i++) {
            if (max < n[i]){
                max = n[i];
            }
        }
        return max;
    }

    public static String isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        String msg;
        if (count == 2) {
            msg = " 소수 입니다.";
        }else {
            msg = " 소수가 아닙니다.";
        }
        return msg;
    }
}
