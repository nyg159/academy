package ac7week1.ac0712.for_3;

public class Ex01 {

    /*
        중첩 반복문 : 반복문안에 또 반복문을 구성하는 방식
     */
    public static void main(String[] args) {

        for(int i = 0; i <= 3;  i++){           //  바깥 for : 행 반복

            for (int j = 1; j <= 5; j++){       //  안쪽 for : 열 반복
                System.out.println(j + " ");
            }
        }



        
    }
}
