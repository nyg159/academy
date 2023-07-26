package ac7week1.ac0711;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
        // 버스는 10 정거장 미만일 경우 각 역 평균 이동 시간이 2분 소요되며, 10 정거장이 넘으면 4분의 소요시간이 걸린다.
        // 정거장 수를 입력하면 소요시간을 계산하여 출력하시오

        Scanner sc = new Scanner(System.in);
        int sub;
        int hour,min ;
        System.out.print("정거장 수를 입력하시오 : ");
        sub = sc.nextInt();

        if(sub >= 10){
            sub = sub * 4;
            if(sub >= 60){
                hour =  sub / 60;
                min =  sub % 60;
                System.out.printf("소요시간은 %d 시간 %d 분입니다.", hour, min);
            }else {
                System.out.printf("소요시간은 %d 분입니다.", sub);
            }

        }else {
            sub = sub * 2;
            System.out.printf("소요시간은 %d 분입니다.", sub);
        }




    }
}
