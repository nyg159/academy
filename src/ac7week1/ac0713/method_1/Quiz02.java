package ac7week1.ac0713.method_1;

/*
        1. 1~n 까지의 합계를 반환 하는 메소드
        2. 실수 전달시 원넓이를 반환하는 메서드
        실수는 반지름이고 PI는 3.14로 계산할 것
        3. 절대값을 반환하는 메서드
        4. 전달한 배열에서 최대값을 찾아서 반환
        5. 소수를 반환 하는 메서드        소수가 맞으면 true,  틀리면 false


 */
public class Quiz02 {
    static int total(int n) {
        int mmm = 0;
        for (int i = 1; i <= n; i++) {
            mmm += i;
        }
        return mmm;
    }

    static double circle(double r){
        double i = r * r  * 3.14;
        return i;
    }

    static int absolute(int num) {
        int a = 0;
        if (num < 0) {
            a = -1 * num;
        }else {
            a = num;
        }
        return a;
    }

    static int maxArr(int[]arr) {
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++){
            if (maxNum <= arr[i]) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    static int isprime(int num) {
        for (int i = 0; i < num; i++) {
            if(num % i == 0){
                
            }
        }
        return 0;
    }



    public static void main(String[] args) {

        //  1. 1~n 까지의 합계를 반환 하는 메소드
        int sum = total(5);

        System.out.println("sum = " + sum);
        System.out.println("total(10) = " + total(10));


        //2. 실수 전달시 원넓이를 반환하는 메서드
        double cir = circle(6.8);

        System.out.println("cir = " + cir);
        System.out.println("circle(8.88) = " + circle(8.88));

//        3. 절대값을 반환하는 메서드
        int abs = absolute(-5);

        System.out.println("abs = " + abs);
        System.out.println("absolute(5) = " + absolute(5));


//        4. 전달한 배열에서 최대값을 찾아서 반환
        int[] arr = new int[] {70,50,80,90,60};
        int max = maxArr(arr);

        System.out.println("max = " + max);


        System.out.println("7은 소수?" + isprime(7));
        System.out.println("6은 소수?" + isprime(6));

        
    }
}
