package ac7week3.ac0726.file_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {
    //      기계어 출력
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("Ex05.class");

        byte[] buffer = new byte[2048];
        
        fileInputStream.read(buffer);
        System.out.println(Arrays.toString(buffer));

        // 바이트 배열 -> 문자열은 문자열 생성자로 손쉽게 처리가능
        String str = new String(buffer);
        System.out.println(buffer);

        System.out.println("읽어오기 완료");
        
        fileInputStream.close();
    }
}
