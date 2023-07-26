package ac7week2.ac0721.api_1;

import java.util.Arrays;

public class Ex03 {
    // main 의 파라미터인 args 는 프로그램(.class) 실행시 전달되는 값을 받아서 저장한다.
    // 방법 1. cmd 에서 쓰는 방법
    // 해당 클래스가 있는 곳으로 cmd를 연다.
    // java 명령으로 실행하여 띄어쓰기로 값을 전달. ex : java api.Ex03 인자1 인자2
    
    // 방법 2. eclipse 에서 쓰는 법
    // 상단 메뉴에서 Run -> Run configurations
    // 열린 화면의 탭에서 Arguments 에 인자값을 작성후 저장 실행

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
    }
}
