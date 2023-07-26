package ac7week3.ac0726.file_1;

/*
        보조 스트림 : 입출력을 좀 더 효율적으로 돕는 객체

        바이트 타입 :  BufferedInputStream , BufferedOutputStream
        문자 타입   : BufferedReader , BufferedWriter


 */

import java.io.*;

public class Ex03 {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("test2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("보조 스트림을 활용한 출력\n");
        bufferedWriter.write("차이를 모르겠는데?");

        bufferedWriter.close();

    }
}
