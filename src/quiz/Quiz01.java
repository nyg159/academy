package quiz;

/*
        학생 정보 관리 프로그램 (by 콘솔)
        1. 학생 정보를 지정할 클래스 (필드는 이름, 국 영 수)
        2. 매뉴 관리와 실제 학생정보를 처리할 Controller 클래스
        
 */

import java.io.IOException;

public class Quiz01 {
    public static void main(String[] args) throws IOException {
        Controller controller = new Controller();

        controller.run();
        
    }
}
