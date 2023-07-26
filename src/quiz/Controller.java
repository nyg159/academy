package quiz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Controller {
    private Scanner scanner = new Scanner(System.in);
    private LinkedList<Student> linkedList = new LinkedList<Student>();

    private String msg = "이름 : %s 국 %d 영 %d 수 %d";

    void hi(){
        System.out.println("hu");
    }

    public void listRun(){
        // 1.학생 목록 리스트 출력

        System.out.println("------학생 목록------");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i +". "+ linkedList.get(i).toString());
        }

        System.out.println();
    }
    
    void inputInfo(){
        // 2. 학생 정보 입력
        // -> 입력 받은 정보를 리스트에 데이터 넣기
        System.out.println("학생 정보를 입력하세요 (이름, 국,영,수): ");
        String name = scanner.next();
        int kor = scanner.nextInt();
        int eng = scanner.nextInt();
        int mat = scanner.nextInt();

        linkedList.add(new Student(name, kor, eng, mat));
        System.out.println();

    }

    void modifyInfo(){
        // 3. 학생 정보 수정
        // -> 리스트에 있는 정보를 찾아서 수정해야 한다.
        System.out.print("수정 하고 싶은 학생 이름을 입력하세요 : ");
        String studentName = scanner.next();
        System.out.println();

        int index = -1;
        for (int i = 0; i < linkedList.size(); i++) {
            if(linkedList.get(i).getName().equals(studentName)){
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("해당 학생을 찾을 수 없습니다.");
        }else {
            System.out.print("수정된 학생 정보를 입력하세요 (이름, 국,영,수) : ");
            String modifyName = scanner.next();
            int modifyKor = scanner.nextInt();
            int modifyEng = scanner.nextInt();
            int modifyMat = scanner.nextInt();

            linkedList.set(index,(new Student(modifyName,modifyKor,modifyEng,modifyMat)));
            System.out.println("수정된 학생 : "+linkedList.get(index));
        }
        System.out.println();
    }
    
    void deleteInfo(){
        // 4. 학생 정보 제거
        // -> 입력 받은 데이터를 리스트에서 찾아 리스트에 있는 정보를 찾아서 해당 데이터 제거

        System.out.print("삭제 하고 싶은 학생 이름을 입력하세요 : ");
        String studentName1 = scanner.next();
        System.out.println();

        int index = -1;
        for (int i = 0; i < linkedList.size(); i++) {
            if(linkedList.get(i).getName().equals(studentName1)){
                index = i;
                System.out.println(linkedList.get(i).getName() + " 은 삭제 되었습니다.");
                linkedList.remove(index);
            }
        }

        System.out.println();
    }

    void saveInfo() throws IOException {
        // 5. 학생 정보 저장
        // -> 리스트에 저장된 데이터들을 파일로 저장
        FileWriter fileWriter = new FileWriter("학생점수.txt");
        for (int i = 0; i < linkedList.size(); i++) {
            fileWriter.write(linkedList.get(i).toString()+"\n");
            System.out.println(linkedList.get(i).toString());
        }
        fileWriter.close();
        System.out.println();
    }

    void loadFile() throws IOException {
        // 6. 파일 불러오기
        // -> 저장된 파일을 불러와서 콘솔에 출력해준다.
        File file = new File("학생점수.txt");
        if (file.isFile()) {
            Scanner fileScan = new Scanner(file);

            String scanName;
            int scanKor, scanEng, scanMat;

            while (fileScan.hasNext()) {
                scanName = fileScan.next();
                scanKor = fileScan.nextInt();
                scanEng = fileScan.nextInt();
                scanMat = fileScan.nextInt();

                System.out.println("이름 : " + scanName);
                System.out.printf("성적 : 국 %d 영 %d 수 %d ", scanKor,scanEng,scanMat);
            }

        }else {
            System.out.println("파일이 존재하지 않습니다.");
        }
        System.out.println();
    }




    public void run() throws IOException {
        int menu;

        do {
            System.out.println("--------- 매뉴---------");
            System.out.println("\t 1. 학생목록");
            System.out.println("\t 2. 학생 정보 입력");
            System.out.println("\t 3. 학생 정보 수정");
            System.out.println("\t 4. 학생 정보 제거");
            System.out.println("\t 5. 학생 정보 저장");
            System.out.println("\t 6. 파일 불러오기");
            System.out.println("\t 0. 프로그램 종료");
            System.out.println(linkedList);

            System.out.print(">>>>");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    listRun();
                    break;

                case 2:
                    inputInfo();
                    break;

                case 3:
                    modifyInfo();
                    break;
                case 4:
                    deleteInfo();
                    break;

                case 5:
                    saveInfo();
                    break;
                case 6:
                    loadFile();
                    break;
            }

        } while (menu != 0);



        scanner.close();
    }



}




