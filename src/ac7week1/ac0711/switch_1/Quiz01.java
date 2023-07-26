package ac7week1.ac0711.switch_1;

import java.util.Scanner;

public class Quiz01 {
    /*
    문제 : 국영수 세과목의 성적을 입력받아 합계와 평균을 구하고 등급 컷을 출력하세요 
    switch 문을 사용해서 풀어라
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float kor, eng, math, sum, evg;
        System.out.println("국 영 수 세과목의 성적을 입력 하시오. : ");
        kor = sc.nextFloat();
        eng = sc.nextFloat();
        math = sc.nextFloat();

        sum = kor + eng + math;
        evg = sum / 3;

        if(evg > 100){
            System.out.println("잘 못된 입력입니다.");
        }else if(evg <= 100 && evg >= 0) {

            // 여기서 케이스를 다 작성 하지 않고 그냥 10으로 나눠서 앞자리만
            // 따서 case 숫자를 줄인다.
            switch ((int) evg) {
                case 100:
                case 99:
                case 98:
                case 97:
                case 96:
                case 95:
                case 94:
                case 93:
                case 92:
                case 91:
                case 90:
                    System.out.println("A 등급입니다.");
                    break;

                case 89:
                case 88:
                case 87:
                case 86:
                case 85:
                case 84:
                case 83:
                case 82:
                case 81:
                case 80:
                    System.out.println("B 등급입니다.");
                    break;

                case 79:
                case 78:
                case 77:
                case 76:
                case 75:
                case 74:
                case 73:
                case 72:
                case 71:
                case 70:
                    System.out.println("C 등급입니다.");
                    break;

                case 69:
                case 68:
                case 67:
                case 66:
                case 65:
                case 64:
                case 63:
                case 62:
                case 61:
                case 60:
                    System.out.println("D 등급입니다.");
                    break;

                default:
                    System.out.println("f 등급입니다.");
            }
        }else {
            System.out.println("잘못된 입렵입니다.");
        }
    }
}
