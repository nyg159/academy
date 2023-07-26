package ac7week2.ac0720.wrap_1;

/*
        문자열과 형변환
        1. 문자열 -> 정수
        2. 정수, 실수 -> 문자열
        3. 자동 형변환을 사용

 */
public class Ex02 {
    public static void main(String[] args) {
        // 1. 문자열 -> 정수

        String str1 = "123";
        String str2 = "3.141592";

        System.out.println("str1 + str2 = "+ str1+str2);

//        int n1 = (int) str1;  // 강제 형변환 불가능 --- 오류
        // 일반 타입과 클래스 간엔 형변환 불가능

        int n1 = Integer.parseInt(str1);
        double n2 = Double.parseDouble(str2);

        System.out.println(n1 + n2 + "\n");

        // 2. 정수, 실수 -> 문자열
        str1 = Integer.toString(10);
        str2 = Double.toString(6.1234);

        System.out.println(str1 + str2);

        // 3. 자동 형변환을 활용
        str1 = 10 + "";
        str2 = 13.14 + "";

        System.out.println(str1 + str2 + "\n");

        str1 = "" + 10 + 20;    // ("" + 10) + 20
        str2 = 10 + 20 + "";    // (10 + 20) + ""

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);



    }
}
