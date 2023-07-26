package ac7week1.ac0714.methode_2;

public class Quiz01 {

    static void printArr(int[] n) {
        for (int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }
    }

    static void printArr(double[] n) {
        for (int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }
    }
    static void printArr(String[] n) {
        for (int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }
    }



    public static void main(String[] args) {

        int[] arr1 = new int[] {10, 20, 30, 40, 50};
        double[] arr2 = new double[]{3.14, 5.1};
        String[] arr3 = new String[]{"Java", "C/C++"};

        // 3타입 모두 일렬로 출력되게 오버로드 한다.

        printArr(arr1);
        printArr(arr2);
        printArr(arr3);

    }
}
