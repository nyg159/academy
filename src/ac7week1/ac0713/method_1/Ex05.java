package ac7week1.ac0713.method_1;

/*
        메서드는 크게 2가지로 분류된다
        1. 반환값이 없는 메서드 : void 타입 -> 종속문을 실행만 할뿐 결과값을 주지 않는다.
        2. 반환값이 있는 메서드 : 자료형 타입, 종속문 실행 후 지정한 자료형의 결과값을 준다
        
        반환값 (return value) 
        - 메서드 실행 후 전해지는 결과값을 의미
        
        
 */
public class Ex05 {

    static void adder(int n1, int n2) {         //void 형
        int sum = n1 + n2;
        System.out.println(sum);
    }

    static int adder2(int n1, int n2) {     // int 값을 return 해주겠다고 하는 자료형 메서드
        int sum = n1 + n2;

        return sum;
    }


    public static void main(String[] args) {
        
//        int aa = adder(); -> 애러 void 형이라 자료형 불일치  대입연산자가 올수 없다.
        
        adder(5,6);                         // void 형은 실행만 하기 때문에 이름만 작성해서 사용
        int n = adder2(6,7);                // 반환형 메서드는 결과값을 돌려주기 때문에
                                            // 1. 변수에 저장받거나


        System.out.println(adder2(7,8));    // 2. 다른 메서드의 전달값으로 사용한다.
        System.out.println(n);


        // 연습 : 아래 코드를 해석해 보세요
        int result = adder2(adder2(7,1),adder2(3,8));

        System.out.println("result : " + result);




    }
}
