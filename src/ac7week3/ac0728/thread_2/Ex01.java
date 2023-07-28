package ac7week3.ac0728.thread_2;

/*
        Thread : 쓰레드
        프로그램 내의 실행 흐름 단위
        기본적으로 main 에서 한개의 쓰레드가 생성되고 코드가 실행된다.
        이 쓰레드를 여러개를 생성해서 프로그램을 작성할 수 있다.
        이를, 멀티 쓰레딩이라고 한다.

 */


// Thread 클래스를 상속 받아서 구현 가능
class Test extends Thread {
    @Override
    public void run() {     // run() : 새 쓰래드를 생성해서 실행할 코드를 작성
        for (int i = 5; i >= 1; i--) {
            System.out.println(i + " 초");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}
public class Ex01 {
    public static void main(String[] args) throws InterruptedException {
        Test test1 = new Test();
        Test test2 = new Test();

        test1.run();        // run() 을 그냥 호출 하면 새 쓰래드가 생성되지 않음
        test2.run();

        test1.start();      // start() 는 run() 을 호출한다.
        test2.start();      // 이때, 새 쓰래드를 만들면서 run() 실행

        for (int i = 10; i >= 1; i--) {      // 메인 쓰래드가 실행 되는거라 결국
                                            // test1.start() test2.start() 와 같이 3개의 쓰래드가 작동한다
            System.err.println(i + " : Hello");
            Thread.sleep(1000);
        }
        
    }

}
