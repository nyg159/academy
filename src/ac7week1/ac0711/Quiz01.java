package ac7week1.ac0711;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        // 국영수 세과목의 성적을 입력받아 합계와 평균을 구하고 등급 컷을 출력하세요
        // 90이상 A 80이상 B 70이상 C 60이상 D 그아래 F

        float point,k,e,m;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수를 입력 하시오 : ");
        k = sc.nextInt();

        System.out.println("영어 점수를 입력 하시오 : ");
        e = sc.nextInt();

        System.out.println("수학 점수를 입력 하시오 : ");
        m = sc.nextInt();

        point = (k + e + m) / 3;

        if(point >= 90){
            System.out.println("A등급 입니다.");
        } else if (point >= 80) {
            System.out.println("B 등급");
            
        } else if (point >= 70) {
            System.out.println("C 등급");
        } else if (point >= 60) {
            System.out.println("D 등급");
        }else{
            System.out.println("F 등급");
        }

    }
}
