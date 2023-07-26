package ac7week1.ac0712.array_1;


public class Ex03 {
    /*
            배열의 인덱스는 0 부터 n 순으로 순차적으로 증가
            따라서 반복문과 궁합이 좋다
     */
    public static void main(String[] args) {

        int arr[] = new int[] {10,20,30,40,50};

        System.out.println("배열의 크기 : "+ arr.length);
        // 자바의 배열은 요소의 개수(= 크기)를 가진 변수가 있다.

        for (int i = 0; i < arr.length; i++){
            System.out.printf("arr[%d] = %d\n", i,arr[i]);

        }
        System.out.println("");

        for (int i = 0; i < args.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        
    }
}
