package ac7week1.ac0714.methode_2;

/*
        메서드 오버로딩 (method overloading)
        같은 이름의 메서드를 어려게 작성하는 방식
        단, 매개변수의 형태가 달라야 한다.
        반환형은 영향을 주지 않는다.
 */
public class Ex01 {

    static int adder(int n1, int n2) {          // 1번 
        return n1 + n2;
    }

    static int adder(int n) {                   // 2번
        return n + 10;
    }

   /* static double adder(int n) {              // 반환형 (리턴 값의 자료형)이 다르면 오버로딩 되지 않는다.
        return 0.0;                             // 매개변수 자료형이랑 리턴값 자료형이 불일치 한다면 오류
    }
*/
   static double adder(double n) {              // 3번
       return n + 3.14;
   }
    public static void main(String[] args) {

        System.out.println("adder(5,3) = " + adder(5, 3));  // 1번 메서드 호출
        System.out.println("adder(5) = " + adder(5));    // 2번 메서드 호출
        System.out.println("adder(5.0) = " + adder(5.0));    // 3번 메서드 호출

    }
}
