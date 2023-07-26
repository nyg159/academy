package ac7week1.ac0713.method_1;


public class Ex02 {
    // 

    static void hello(int n){ // int n 은 매개변수 (parameter) : 전달된 값을 저장하는 변수, 종속문에서 활용 가능
        for (int i = 0; i <= n; i++){
            System.out.println(i + " hi");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        
        hello(3); // 전달인자(arguments) : 메서드 호출시 전달하는 값
        
//        hello(5.0);   매개변수가 int 로 받는데 실수형으로 주면 애러 : 타입 불일치
//        hello(); :    전달인자 부족
//        hello(3,5);   전달인자 갯수 불일치 또는 매개변수 갯수 불일치

        // ## 전달 인자와 매개변수는 개수 및 자료형을 일치 시킨다 !!!!
    }
}
