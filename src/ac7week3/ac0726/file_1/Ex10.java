package ac7week3.ac0726.file_1;

/*
        File : 파일을 처리를 돕는 클래스

 */

import java.io.File;
import java.io.IOException;

public class Ex10 {
    public static void main(String[] args) throws IOException {

        File file1 = new File("E:\\없는 파일.txt");
        File file2 = new File("E:\\JavaTest.txt");
        File file3 = new File("E:\\JavaFolder");

        System.out.println(file1.exists()+"\n");     // exists() 해당 파일이 존재하는지 확인 하는 법
        System.out.println(file2.exists()+"\n");     // boolean 형

        System.out.println(file3.exists()+"\n");

        file1.createNewFile();                  // 빈 파일 생성하는 메서드, 기존 파일이 있으면 아무런 효과가 없음
        file3.mkdir();                          // 빈 폴더를 생성하는 메서드, 기존 폴더가 있으면 아무런 효과가 없음

        System.out.println("file2 파일인가?" + file2.isFile());
        System.out.println("file2 폴더인가?" + file2.isDirectory());
        System.out.println("읽기 가능? " + file2.canRead());
        System.out.println("쓰기 가능? " + file2.canWrite());
        System.out.println("실행 가능? " + file2.canExecute());
        System.out.println("파일 이름 : " + file2.getName());
        System.out.println("파일 실제 경로 : " + file2.getAbsolutePath());
        System.out.println("파일 크기 : " + file2.length());

        String fileName = file2.getName();
        System.out.println(fileName.substring(0,fileName.indexOf(".")));    // 확장명 때서 파일 이름만 출력하기


        System.out.println();
        System.out.println("file3 파일인가?" + file3.isFile());
        System.out.println("file3 폴더인가?" + file3.isDirectory());
        System.out.println("읽기 가능? " + file3.canRead());
        System.out.println("쓰기 가능? " + file3.canWrite());
        System.out.println("실행 가능? " + file3.canExecute());





    }
}
