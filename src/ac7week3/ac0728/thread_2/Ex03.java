package ac7week3.ac0728.thread_2;

/*
        Runnable 을 함수형 인터페이스
        즉 run() 을 람다식 으로 바로 구현 가능


 */

public class Ex03 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 5; i >= 1; i--) {
                System.out.println(i + " 초");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("쓰래드 1 끝");
            System.out.println();
        };

        Thread thread1 = new Thread(runnable);

        Thread thread2 = new Thread(() -> {
            for (int i = 5; i >= 1; i--) {
                System.err.println(i + " 번!!!");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        
        thread1.start();            // start() 로 실행한다.
        thread2.start();

        System.out.println("main 쓰래드 끝");
        
        



    }
}
