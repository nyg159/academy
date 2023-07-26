package ac7week2.ac0721.api_1;

/*
        자바의 랜덤은 두가지로 제공된다.
        1. Math 의 random 메소드
        2. random 클래스
        
        % 나머지의 용도는 ? 1. 배수 판별  2. 범위 제한  3. 숫자 지정 자리 뽑기
        n % m = 0 ~ (m - 1)
        
 */
public class Ex05 {
    public static void main(String[] args) {
        int ran = (int)(Math.random() * 100) % 21;      // % 21 하면 0~ 20 까지의 수가 나온다.
        System.out.println(ran);

        int ran1 = (int)(Math.random() * 100) % 16 + 5;
        // 이렇게 하면 5 ~ 20 까지의 수를 구함
        // 0 ~ 15 까지의 수를 구한뒤 5를 더한다.
        System.out.println(ran1);
    }
}
