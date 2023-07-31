package ac8week1.ac0731.socket_1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10002);
        System.out.println("서버 on. 연결 대기중....");

        Socket socketClient = serverSocket.accept();
        System.out.println("클라이언트가 연결되었습니다.");

        Scanner scanner = new Scanner(socketClient.getInputStream());
        // 클라이언트의 입력을 읽을 scanner

        while (scanner.hasNextLine()) {
            System.out.println("받은 데이터 : " + scanner.nextLine());
        }


        socketClient.close();
        serverSocket.close();       // 꼭 close() 해줘야 한다.
        System.out.println("\n클라이언트 연결이 종료 되었습니다.");
    }
}
