package ac7week1.ac0711.for_1;

public class Ex08 {
    public static void main(String[] args) {
        // 보조 제어문 1. break : 제어문을 즉시 종료

        for (int i = 1; i <=10; i++){
            if(i == 5){
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // continue : 제어문을 즉시 처음으로 이동
        // 5 제외 하고 계속 출력 됨
        for (int i = 1; i <=10; i++){
            if(i == 5){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
