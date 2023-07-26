package ac7week1.ac0712.array_1;

/*
        변수 : 데이터를 저장하는 공간. 단일 값
        배여 : '같은 ' 자료형으로  메모리 상 연속된 공간, 복수 값

 */
public class Ex01 {
    public static void main(String[] args) {
        // 변수
        int n =10;

        // 배열
        int[] arr = new int[] {10,20,30,40,50};
        System.out.println(n);
        System.out.println(arr); // 해쉬 테이블에서 관리 하는 값이 출력 됨
        // 배열은 참조 타입이고, 참조 변수를 그냥 출력하면 '해쉬코드'가 출력된다.
        // 해쉬 코드는 객체의 고유값으로 사람으로 치면 '주민등록번호'에 해당
        // 배열은 참조 변수를 참조한다.

        // 이렇게 배열을 사용해야 정확하게 데이터에 접근할 수 있다.
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[4] = " + arr[4]);
        // 배열에 저장된 데이터를 요소라고 한다.
        // 요소에 접근하기 위해선 참조 변수와 index 의 조합으로 접근

//        System.out.println(arr[5]);  -> 예외
    }
}
