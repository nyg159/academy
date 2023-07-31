package ac8week1.ac0731.socket_1;

/*
        socket : 소캣
        네트워크 통실을 가능하게 하는 프로그래밍 인터페이스를 의미
        자바는 Socket 이라는 객체를 이미 제공중

 */

import java.io.IOException;
import java.net.ServerSocket;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
    }


}
