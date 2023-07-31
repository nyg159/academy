package ac8week1.ac0731.socket_1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 10003);
        System.out.println("서버에 연결됨");

        PrintWriter outputPrintWriter = new PrintWriter(socket.getOutputStream(), true);

        Scanner inputScanner = new Scanner(socket.getInputStream());

        Scanner scanner = new Scanner(System.in);
        String msg;

        do {
            System.out.print("입력 (0 종료): ");

            msg = scanner.nextLine();

            outputPrintWriter.println(msg);

            if (inputScanner.hasNextLine()) {
                System.out.println("\n입력 받은 데이터 : " + inputScanner.nextLine());
            }
            
        } while (!"0".equals(msg));




        outputPrintWriter.close();
        socket.close();
        System.out.println("\n연결이 종료되었습니다.");
    }
}
