package ac8week1.ac0731.socket_1;

/*
        Ex02 의 양방향(반이중) 코드를 참고해서
        멀티 쓰래드를 활용한 전이중 통신을 구현
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10004);
        System.out.println("서버 ON 연결 대기중.....");

        Socket clientSocket = serverSocket.accept();
        System.out.println("클라이언트 연결됨");

        PrintWriter outputPrintWriter = new PrintWriter(clientSocket.getOutputStream(),true);
        Scanner intputScanner = new Scanner(clientSocket.getInputStream());


        Thread inputThread = new Thread(() -> {
            Scanner sc = new Scanner(System.in);
            String msg;

            do {
                System.out.print("입력 (0 종료) : ");
                msg = sc.nextLine();

                outputPrintWriter.println(msg);

            } while (!"0".equals(msg));


        });


        inputThread.start();

        while (intputScanner.hasNextLine()) {
            System.out.println("입력받은 데이터 : "+ intputScanner.nextLine());
        }

        serverSocket.close();
        clientSocket.close();
        System.out.println("연결이 종료 되었습니다.");
    }

}
