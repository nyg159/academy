package other;
/*
        인터페이스
        - 아무것도 구현되어 있지 않은 껍데기 클래스
        - 자바에서 '다중 상속' 이 가능한 타입
        - 필드는 public static final 속성이 되고
        - 메서드는 public abstract 가 된다.


 */

public interface Flyable {
    String type = "날개";

    void fly();         // 무조껀 오버라이드를 해야 해서 충돌날 일이 없다.
    
}
