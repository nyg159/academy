package ac8week1.ac0731.socket_1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex02Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",10002);
        System.out.println("서버 연결됨");

        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);


        String msg = scanner.nextLine();


        do {
            System.out.print("입력 (0 은 종료) : ");

            msg = scanner.nextLine();

            printWriter.println(msg);

        } while ("0".equals(msg));


        socket.close();
        scanner.close();
        System.out.println("서버 연결이 종료되었습니다.");
    }
}
