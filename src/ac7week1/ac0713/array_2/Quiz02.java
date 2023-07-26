package ac7week1.ac0713.array_2;

/*
//       1. 8 X 8 이차원 배열에 1~64 까지 채우고 for-each 문으로 출력해보세요. (가로로 오름차순)

//       2. 8 X 8 이차원 배열에 1~64 까지 채우고 for-each 문으로 출력해보세요. (세로로 오름차순)
 */
public class Quiz02 {
    public static void main(String[] args) {
        
//       1. 8 X 8 이차원 배열에 1~64 까지 채우고 for-each 문으로 출력해보세요. (가로로 오름차순)
        System.out.println("1번 문제");
        int[][] arr1 = new int[8][8];

        int count = 1, count_1 = 1;

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[0].length; j++){
                arr1[i][j] = count;
                count += 1;
                System.out.printf("%2d", arr1[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        //       2. 8 X 8 이차원 배열에 1~64 까지 채우고 for-each 문으로 출력해보세요. (세로로 오름차순)
        System.out.println("2번 문제");
        int[][] arr2 = new int[8][8];


        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[0].length; j++){
                arr2[i][j] = count_1;
                count_1 += 1;

                System.out.printf("%2d", arr2[j][i]);
                System.out.print(" ");
            }
            System.out.println("");
        }





    }
}
