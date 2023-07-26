package ac7week3.ac0725.exception_1;

/*
        오류 : 프로그램에서 비정상적으로 동작하는 행위
        1. 에러 : 시스템 레벨의 오류, 보통 기계상의 결함을 의미
        2. 예외(exception) : 논리 레벨의 오류, 개발자의 잘못된 로직이나 사용자의 부적합한 입력에 의해 발생

        예외 처리 : 예외는 개발자가 사후 혹인 미리 예측해서 회피가 가능하다.
        - 예외 처리를 하지 않으면 사용 불가능한 메서드가 있다.
        - 예외 발생시 잘못된 실행 흐름을 다시 원래대로 잡아 줄 수 있다.

*/
public class Ex01 {
    public static void main(String[] args) {
//        System.out.println(10/0);
        // 예외가 발생해서 JVM 이 예외를 받아주지 않아 다음 코드 실행 불가

        
        // try - catch 문
        try {
            System.out.println(10 / 0);

            System.out.println("여기는 예외 발생시 실행 x");

        } catch (ArithmeticException e) {

            // 밑에 3가지 중 한가지를 사용 하면 된다.
            // 예외가 발생하면 어떤 예외인지 개발자에게 알려 주면 좋다
            System.err.println("예외 발생!!!!  0 으로 나누었습니다.");  //  1. 직접 구문 작성
            // err 예외 확인 하기 좋다 빨간 글씨로 출력됨 에러 출력때만 사용하자.
            System.err.println("예외발생. " + e.getMessage());      // 2. 예외 객체로 예외 메세지를 받는다.

            e.printStackTrace();                                   // 3. 어느 위치에서 예외 발생했는지 추적 Trace
        }


        try {
            System.out.println(10 / 3);

            System.out.println("여기는 예외 발생시 실행 x");

        } catch (ArithmeticException e) {
            System.out.println("예외 발생!!!!");
        }

        System.out.println("여기는 무조껀 실행 된다.");

    }


}
