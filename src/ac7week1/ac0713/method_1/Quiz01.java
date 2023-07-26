package ac7week1.ac0713.method_1;

import java.util.Scanner;

/*
//         이전코드들이 실행되게 메서드를 구현
//        1. 1 ~ n 까지 일렬로 출력하는 메서드
//        printNumber(5); // 1 2 3 4 5
//        printNumber(3); // 1 2 3

//        2. 전달한 함수의 약수를 출력
//        printDivisor(6);     1 2 3 6
//        printDivisor(4);     1 2 4
//
//
//        3. n ~ m 사이의 수를 출력
//        printNum(5,10) : 5  6 7 8 9 10
//        printNum(7,10) : 7 8 9 10
//
//        4. 전달한 배열을 일렬로 출력
//        int[][] arr1 = new int[] {10,20,30}
//        int[][] arr2 = new int[] {3,5,7,9}
//
//        printArr(arr1); // 10 20 30
//        printArr(arr2); // 3 5 7 9
 */
public class Quiz01 {

//        1. 1 ~ n 까지 일렬로 출력하는 메서드
//        printNumber(5); // 1 2 3 4 5
//        printNumber(3); // 1 2 3
    static void printNumber(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //        2. 전달한 함수의 약수를 출력
//        printDivisor(6);     1 2 3 6
//        printDivisor(4);     1 2 4
    static void printDivisor(int m1) {
        for (int i = 1; i <= m1; i++) {
            if(m1 % i == 0){
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

//        3. n ~ m 사이의 수를 출력
//        printNum(5,10) : 5 6 7 8 9 10
//        printNum(7,10) : 7 8 9 10
    static void printNum(int a, int b){
        for (int i = 0; i <= b-a; i++){
            System.out.print(a + i +" ");
        }
        System.out.println();
    }
//        4. 전달한 배열을 일렬로 출력
//        int[][] arr1 = new int[] {10,20,30}
//        int[][] arr2 = new int[] {3,5,7,9}
//
//        printArr(arr1); // 10 20 30
//        printArr(arr2); // 3 5 7 9

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1번 문제 정수를 입력해주세요 : ");
        int n = scanner.nextInt();
        printNumber(n);

        System.out.print("2번 문제 정수를 입력해주세요 : ");
        int m1 = scanner.nextInt();
        printDivisor(m1);

        System.out.println("3번 문제 정수 2개를 입력해주세요 : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        printNum(a,b);

        System.out.println("4번 문제 전달한 배열을 출력");
        int[] arr1 = new int[] {10,20,30};
        int[] arr2 = new int[] {3,5,7,9};

        printArr(arr1);
        printArr(arr2);

    }
}
