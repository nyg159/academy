package ac7week1.ac0711.for_1;

/*
        지역 변수 : 특정 영역 안에 포함된 변수를 의미
        해당 영역에서 생성되고 그영역에서 끝나면 메모리에서 제거 된다.
 */
public class Ex07 {
    public static void main(String[] args) {

//        int i;
        // i 는 지역 변수로 사용후 메모리에서 삭제 된다.
        // 전역 함수로 지정하면 사라지지 않음 
        for(int i = 1; i <=5; i++){
            System.out.println(i + "hello");
        }
//        System.out.println(i);
        // 전역변수로 i를 만들어 추출
        // main 함수가 끝나면 전역함수가 끝남
    }
}
