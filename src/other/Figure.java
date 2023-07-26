package other;

/*
        추상 클래스
        - 추상적인 객체를 구현시 사용하는 클래스
        - 추상적인 개념이라 인스턴스 생성이 불가능
        - 상속을 위해서 사용하는 클래스
        - 일부분만 구현되고 일부분은 미구현된 클래스

        추상 메서드 -> 다형성을 강제 하는 것
        - 추상 클래스만 가질 수 있는 메서드
        - 몸체(= 실행코드)가 없는 메서드!!!!
        - 자식 클래스에서 무조건 오버라이드해서 '구현'해야한다.

 */
public abstract class Figure {

    public void show() {
        System.out.println("도형 객체 입니다.");
    }
    public abstract void draw();        // 오버라이드를 꼭 해서 사용해야함




}
