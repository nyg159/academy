package ac7week3.ac0726.file_1;

/*
        단순한 텍스트를 읽어올땐 Scanner 를 사용하면 더욱 쉽다.
        json 이나 xml 도 받을 수 있다.

        
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Windows\\System32\\drivers\\etc\\hosts"); // 절대 경로로 파일 찾는 법
        Scanner scanner = new Scanner(file); // 괄호안에는 글자 그대로 받아옴

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        
        scanner.close();
    }
}
