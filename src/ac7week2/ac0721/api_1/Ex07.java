package ac7week2.ac0721.api_1;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 50, 40, 30, 20};
        System.out.println("50의 위치" + Arrays.binarySearch(arr,50));

        // 이진탐색 트리는 정렬을 하고 사용해야 한다.
        Arrays.sort(arr);
        System.out.println("50의 위치" + Arrays.binarySearch(arr,50));

        int[][] arr2 = new int[][]{
                {10,20,30,40,50},
                {11,12,13,14,15},
                {22,33,44,55,66}
        };

        // 2차 배열 출력
        System.out.println("arr2 = " + Arrays.deepToString(arr2));
        
        
    }
}
