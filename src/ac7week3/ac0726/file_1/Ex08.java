package ac7week3.ac0726.file_1;


/*
        버퍼 사용 했을 경우
        1. 크기를 맞출 필요가 없음
        2. 속도 개선
 */

import java.io.*;

public class Ex08 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("jdk8.exe"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("copy8.exe"));

        int i;


        while ((i = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(i);
        }


        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
