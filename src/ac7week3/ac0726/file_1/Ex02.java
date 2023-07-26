package ac7week3.ac0726.file_1;

/*
        파일 읽기


 */

import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("test1.txt");

        char buffer[] = new char[100];      // 한번에 읽어 올 양을 정함 하지만 한계가 있다.

        fileReader.read(buffer);
        System.out.println(buffer);
        System.out.println("\n파일 읽기 완료");
        
        fileReader.close();

    }
}
