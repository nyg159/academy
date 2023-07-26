package ac7week1.ac0712.for_2;

public class Quiz03 {
    /*
            1. 첫날에는 1원을 예금하고, 다음날에는 전날의 2배의 금액을 예금하는 방식으로 한달(30일) 동안 저축한 금액을 출력
            다시 풀어보자
     */
    public static void main(String[] args) {
        long money = 1;
        long n = 0,m = 0;

        for (int i = 1; i <= 30; i++){
            n++;
            money += m;
            m = n * 2;


            System.out.println(i + " 일째 " + m + "을 예금  총액은 : " + money);

        }
        
    }
}
