package ac7week1.ac0711.for_1;

public class Ex01 {

    /*
    반복문 : 조건에 따라서 코드를 루프
     */
    public static void main(String[] args) {
        /*
        while 문
        조건이 참이면 종속문을 수행
        종속문이 끝나면 다시 조건으로 이동
        무한 루프를 looping 이라고도 한다.
         */

        int i = 1;  // 초기값

        while (i <= 5){ // 반복문의 조건식

            System.out.print(i + "hi");
            i++; // 증감식
        }

        System.out.print("반복 후 i = "+ i);

        i = 5;

        while (i >= 1){
            System.out.println(i + "hi");
            i--;

        }


    }
}
