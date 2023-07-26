package ac7week2.ac0719.inheritance_2;

/*
        Object 클래스 
        java 의 최상의 클래스
        java 의 모든 클래스는 예외 없이 object 를 상속 받는다
        모든 클래스는 object 로 업캐스팅이 가능하다.

 */
class Po {              // Object 는 작성하지 않아도 자동으로 상속됨
    private int x, y;

    Po(int x,int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
public class Ex05 {
    public static void main(String[] args) {
        Po p1 = new Po(3, 2);
        Po p2 = new Po(3, 2);
        Po p3 = p1;

        System.out.println("p1 = " + p1);
        System.out.println("p1 = " + p1.toString());
        // 출력에 참조 변수를 두면 toString 을 호출하게 되어 있다
        System.out.println();

        System.out.println("p1 = " + p1.hashCode());

        System.out.println("p1 = " + Integer.hashCode(p1.hashCode()));
        System.out.println();

        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3+ "\n");


        System.out.printf("p1 = %x\n",p1.hashCode());
        System.out.printf("p2 = %x\n",p2.hashCode());
        System.out.printf("p3 = %x\n",p3.hashCode());

        System.out.println();

        System.out.println("p1 == p2 결과 : " + (p1 == p2));
        System.out.println("p1 == p2 결과 : " + (p1 == p3));
        // 참조 변수의 비교는 같은 객체(= 인스턴스)를 가리키는가 비교
        // 즉, 필드를 비교 하는게 아니다.

        System.out.println("p1.equals(p2) 결과 : " + p1.equals(p2));
        System.out.println("p1.equals(p3) 결과 : " + p1.equals(p3));
        // equals() 그냥 쓰면 ==와 동일 한 효과
        // 오버라이드가 가능하기 때문에 원하는 필드를 비교하게 변경가능

    }
}
