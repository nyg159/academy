package ac7week2.ac0720.final_1;

/*
        final 용도
        1. 변수의  사용   : 변수를 상수로 변화해줍니다.
        2. 메서드에 사용  :  오버라이드를 방지합니다. 오버라이드 금지
        3. 클래스에 사용  :  상속이 불가능한 클래스로 지정(기능확장 불가, 자식클래스를 만들수 없음)
 */
public class Ex01 {
    public static void main(String[] args) {

        int n = 10;
        final int FN = 10;

        System.out.println("n = " + n);
        System.out.println("n = "+ FN);
        System.out.println();
        
        n = 20;
//        FN = 20;                      // 한번 값을 지정하고 나면 다시는 변경이 불가능 (오류)
//        FN += 2;                      // 해당 공간을 변경하는 연산은 전부 불가능
//        FN++;

        System.out.println("FN + 5 = " +  (FN + 5));
        System.out.println("FN <= 20 = " + (FN <= 20));
        // FN 의 값을 변경하지 않는 연산은 가능

    }
}
