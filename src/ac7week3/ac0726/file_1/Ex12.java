package ac7week3.ac0726.file_1;

/*
        저장한 내용 불러오기

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("E:\\JavaSave\\학생점수.txt");
        Scanner scanner = new Scanner(file);

        String name;
        int kor, eng, mat, sum;
        double avg;

        while (scanner.hasNext()) {

            name = scanner.next();
            kor = scanner.nextInt();
            eng = scanner.nextInt();
            mat = scanner.nextInt();

            sum = kor + eng + mat;
            avg = sum / 3.0;

            System.out.println("불러오기 성공");
            System.out.println("\n이름 : " + name);
            System.out.printf("성적 : 국 %d 영 %d 수 %d \n", kor, eng, mat);
            System.out.printf("합계 : %d (%1f)\n", sum, avg);

        }



        scanner.close();


    }
}
