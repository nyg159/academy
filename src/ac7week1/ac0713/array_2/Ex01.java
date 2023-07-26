package ac7week1.ac0713.array_2;

/*

 */
public class Ex01 {
    public static void main(String[] args) {
        // 1차원 배열 : 특정 자료형을 일렬로 저장
        int[] arr1 = new int[] {10,20,30,40,50};

        // 2차원 배열 : 1차원 배열을 요소로 저장
        // 이렇게 하는거 권장
        int[][] arr2 = new int[][] {
                {1,2,3,4},      // 0행
                {5,6,7,8},      // 1행
                {9,10,11,12}    // 2행
               //0  1 2  3
        };

        int[][] arr3 = new int[][]{ {1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println(arr2[0][1]); // 이런 식으로 출력
        System.out.println(arr2[2]); // 이러면 전체 출력이 아니넹?


    }
}
