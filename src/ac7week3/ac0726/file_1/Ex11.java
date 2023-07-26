package ac7week3.ac0726.file_1;

/*
        입력 받은 내용을 파일로 저장하기
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String name;
        int kor, eng, mat, sum;
        double avg;

        System.out.println("이름 : ");
        name = scanner.next();

        System.out.println("국 영 수 : ");
        kor = scanner.nextInt();
        eng = scanner.nextInt();
        mat = scanner.nextInt();

        sum = kor + eng + mat;
        avg = sum / 3.0;

        System.out.println("\n이름 : " + name);
        System.out.printf("성적 : 국 %d 영 %d 수 %d\n", kor, eng, mat);
        System.out.printf("합계 : %d (%.1f)\n", sum, avg);
        
        // 파일로 저장하기
        File path = new File("E:\\JavaSave");
        File save = new File(path, " 학생점수.txt");

        if (path.exists() == false) {
            path.mkdir();
        }

        String context = String.format("%s %d %d %d\n", name, kor, eng, mat);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(save,true));
        // FileWriter 에 true 는 내용을 추가하겠다는 의미
        
        
        bufferedWriter.write(context);    //writer 는 기존 내용을 지우고 쓰는 덮어쓰기 ture 가 들어오면 추가 됨
        


        System.out.println("학생 점수 .txt 로 저장했습니다.");
        bufferedWriter.close();
        scanner.close();
    }
}
