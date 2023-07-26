package ac7week2.ac0721.interface_2;

import java.util.Arrays;
import java.util.Comparator;

/*
        문자열 정렬
 */
public class Ex03 {
    public static void main(String[] args) {
        String[] words = new String[]{"Python","Java", "Go","C/C++"};       // ASC

        Arrays.sort(words);
        System.out.println("words = " + Arrays.toString(words));

        Comparator<String> desc = (String o1, String o2) -> {
//            return o1.compareTo(o2);            // o1 - o2 가 된다. 오름차순
            return o2.compareTo(o1);        // 내림차순이 된다.

        };

        Arrays.sort(words,desc);
        System.out.println("words 내림차순 : " + Arrays.toString(words));
        
    }
}
