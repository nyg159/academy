package ac7week2.ac0721.api_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01 {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = 
                new SimpleDateFormat("yyyy 년 MM 월 dd 일 a HH:mm:ss E요일");

        System.out.println(date);

        String time = simpleDateFormat.format(date);      // .format
        System.out.println(time);

    }
}
