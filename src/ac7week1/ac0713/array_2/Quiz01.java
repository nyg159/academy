package ac7week1.ac0713.array_2;

import java.util.Arrays;
import java.util.Scanner;

/*
//        1. 학생 5명의 점수를 저장할 수 있는 배열 생성
//        2. 해당 배열에 점수를 입력
//        3. 입력 받은 배열의 내용을 일렬로 출력
//        4. 학생들 점수의 합계와 평균을 출력
//        5. 가장 높은 점수와 가장 낮은 점수를 출력
//        6. 낮은 순에서 높은 순으로 점수로 정렬( = 오름차순 정렬)

 */
public class Quiz01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //        1. 학생 5명의 점수를 저장할 수 있는 배여을 생성
        System.out.println("문제 1번");
        int[] student = new int[5];
        int[] sortedStudent = new int[5];
        int n = student.length;
        int sum = 0;
        float evg = 0;
        int highPoint = 0, lowPoint = 1000000;
        System.out.println("배열 생성 완료");

//        2. 해당 배열에 점수를 입력
        System.out.println("문제 2번");
        System.out.print("학생 5명의 점수를 정수로 입력해주세요 : ");

        for(int i = 0; i < n; i++ ){
            student[i] = scanner.nextInt();
            //        3. 입력 받은 배열의 내용을 일렬로 출력
            System.out.print(student[i] + " ");
            sum = sum + student[i];

            if (highPoint <= student[i]){
                highPoint = student[i];
            }

            if(lowPoint >= student[i]){
                lowPoint = student[i];
            }
        }

        System.out.println("\n입력 받은 학생 점수 출력 : " + Arrays.toString(student));

        evg = sum / (float)n;

        System.out.printf("학생들 점수의 합계 : %d ,  평균 : %f \n",sum,evg);
        System.out.printf("가장 높은 점수 : %d ,  가장 낮은 점수 : %d ",highPoint, lowPoint);
        // 버블 정렬을 사용했음
        for (int i = 0; i < n - 1; i++){
            boolean change = false;
            for (int j = 0; j < n - 1 - i; j++){
                if(student[j] > student[j + 1]){
                    change =true;
                    int temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
            if(change == false){
                break;
            }
        }
        System.out.print("오름차순 정렬 : ");
        for (int i = 0; i < n; i++){
            System.out.print(student[i] +" ");
        }






    }
}
