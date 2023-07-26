package ac7week1.ac0713.array_2;

public class Ex02 {
    public static void main(String[] args) {
        int arr1[][] = new int[3][4]; // 행 : 3   열 : 4

        System.out.println("arr1 크기 : " + arr1.length); // 행의 크기만 나옴
        System.out.println("arr1[0] 크기 : " + arr1[0].length);// 열의 크기만 출력

        arr1[1][2] = 14;
        arr1[0][0] = 153;

        for (int i = 0; i < arr1.length; i++){
            for (int j =0; j < arr1.length; j++){
                System.out.printf("%3d",arr1[i][j]);
                // %2d 2칸을 비워줌, %3d  3칸을 비워줌 칸이 정렬되어 이상하게 안나옴
            }
            System.out.println("");
        }

    }
}
