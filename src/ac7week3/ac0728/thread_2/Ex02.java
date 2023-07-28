package ac7week3.ac0728.thread_2;


/*
        Thread 는 클래스 입니다
        따라서 상속 받으면 다른 클래스의 상속이 불가능 하다는 문제가 발생
        이를, 해결하기 위해서 Runnable 이라는 인터페이스가 있다

        Runnable 은 함수형 인터페이스
        -> 람다식으로 바로 구현이 가능하다.

 */

class Test2 implements Runnable {

    @Override
    public void run() {
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

public class Ex02 {
    public static void main(String[] args) {

        Test2 test10 = new Test2();

        test10.run();
        test10.run();
        // 그냥 run() 을 호출한것
        // 새 쓰래드는 생성되지 않음

        Thread thread1 = new Thread(test10);
        Thread thread2 = new Thread(test10);
        // Runnable 을 구현한 객체를 Thread 생성자에 전달


        thread1.start();
        thread2.start();
        // Thread 객체로 새 쓰래드를 생성


    }
}
