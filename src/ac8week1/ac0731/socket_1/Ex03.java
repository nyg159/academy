package ac8week1.ac0731.socket_1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10003);
        System.out.println("서버 ON 연결 대기중.....");

        Socket clientSocket = serverSocket.accept();
        System.out.println("클라이언트 연결됨");

        PrintWriter outputPrintWriter = new PrintWriter(clientSocket.getOutputStream(),true);
        Scanner intputScanner = new Scanner(clientSocket.getInputStream());

        Scanner sc = new Scanner(System.in);
        String msg;


        while (intputScanner.hasNextLine()) {
            System.out.println("입력받은 데이터 : " + intputScanner.nextLine());

            System.out.print("\n입력(0 종료) : ");
            msg = sc.nextLine();

            if ("0".equals(msg)) {
                break;
            }

            outputPrintWriter.println(msg);

        }


        serverSocket.close();
        clientSocket.close();
        System.out.println("연결이 종료 되었습니다.");

    }
}
