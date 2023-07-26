package ac7week3.ac0725.exception_1;

/*
        무분별하게 try - catch 문을 사용하면 가독성이 매우 떨어진다.
        그래서 try catch 를 최소화 하기 위해서 한 곳으로 예외를 모을 필요가 있다.
        그게 예외 전가 구문 throw 가 된다.

        throw : 예외를 전가하는 구문
        
        사실 try - catch 쓰기가 귀찮을 때 사용하기도 함

 */

public class Ex03 {
    // main 에서까지 예외를 전가하면 JVM 이 받아서 처리 (예외 발생시 프로그램 종료)
    public static void main(String[] args) throws InterruptedException {

        // try - catch 사용시 sleep() 메서드는 예외가 발생할 일이 별로 없다.
        // 근데 예외 처리를 하지 않으면 컴파일 에러가 발생

        for (int i = 5; i >= 1; i++) {
            System.out.println(i + " 초");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();


        // 2. throws : 현제 메서드에서 발생하는 지정 예외를 모두 호출한 쪽으로 전가한다.
        for (int i = 5; i >= 1; i++) {
            System.out.println(i + " 초");
            Thread.sleep(1000);
        }
        
    }
}
