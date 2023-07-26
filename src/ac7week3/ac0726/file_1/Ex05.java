package ac7week3.ac0726.file_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("test3.exe");
        String output = "Hello";

        fileOutputStream.write(output.getBytes(StandardCharsets.UTF_8));

        System.out.println(Arrays.toString(output.getBytes()));
        System.out.println("파일 출력 완료");

        fileOutputStream.close();
    }
}
