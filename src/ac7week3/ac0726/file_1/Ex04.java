package ac7week3.ac0726.file_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("test2.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {  // 이렇게 하면 다 출력 된다.
                System.out.println(line);


            }
//        String line = bufferedReader.readLine();        // readLine() 은 한 줄만 읽어 온다.
//        System.out.println(line);

        System.out.println("\n 읽어오기 완료");

        bufferedReader.close();
    }
}
