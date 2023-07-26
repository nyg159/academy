package ac7week2.ac0720.interface_1;

/*
        인터페이스의 메서드를 바로 구현 후 사용하고 싶은 경우
        순서 :   1. 인터페이스를 상속 받은 클래스 작성
                2. 추상 메서드 구현
                3. 인스턴스 생성
                4. 메서드 사용

            1,2,3 번을 한번에 묶어서 사용하고 싶으면 '익명 클래스'를 사용 하면 된다.
            익명 클래스 : 추상 클래스나 인터페이스를 즉시 구현해서 사용하고 싶을 때 사용
            하나의 인스턴스만 생성이 가능해서 1회용 클래스이다.
            
            
        lambda 람다식
        JAVA8 부터 추가된 구문
        함수형 인터페이스를 바로 구현할 수 있는 구문
        함수형 인터페이스만 람다식 가능
        함수형 인터페이스 : 메서드를 하나만 가지고 있는 인터페이스를 의미     
            
 */


public class Ex02 {
    public static void main(String[] args) {
        
        // 인스턴스 다음에 바로 클래스 처럼 중괄호가 열림
        // 익명 내부 클래스 라고도 불림 왜냐 Ex02 클래스 내에 존재해서
        
        // 익명 클래스
        USB usb = new USB() {
            @Override
            public void run() {
                System.out.println("USB 구현");
            }
        };
        usb.run();
        
        
        // 람다식
        USB usb2 = () -> {

            System.out.println("USB 3.0 구현");
        };
        usb2.run();
        
    }
}
