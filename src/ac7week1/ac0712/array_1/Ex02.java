package ac7week1.ac0712.array_1;

/*
        배열 생성 방법
 */
public class Ex02 {
    public static void main(String[] args) {
        // 1. 배열을 초기화를 한다.
        int arr1[] = new int[] {10,20,30,40,50}; // 정석 (권장)

        // 2. 빈공간을 생성한다.
        int arr2[] = new int[5]; // 초기값이 기본값으로 세팅된다. 정수는 0 String null

        // 3. 상수로 생성한다.
        int arr3[] = {10,20,30,40,50}; // 임시로 사용할때 좋음

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0] + "\n");

        arr1[0] = 100;
        arr3[0] = 100;

        System.out.println(arr1[0]);
        System.out.println(arr3[0]);



    }
}
