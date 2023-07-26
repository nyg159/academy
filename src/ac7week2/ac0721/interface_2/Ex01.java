package ac7week2.ac0721.interface_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Ex01 {
    public static void main(String[] args) {
        // 아래 배열을 정렬하여 출력 1. 오름차순. 내림차순

        Double[] arr = new Double[]{
                6.1234,
                3.141592,
                5.34
        };
        System.out.println("배열 출력 : " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("오름차순 정렬후 출력 : " + Arrays.toString(arr));


        Comparator<Double> desc = (Double o1, Double o2) -> {
            return o2.compareTo(o1);

        };
        // 함수형 인터페이스를 구현한 람다식을 작성후 전달하거나
        // 바로 람다식을 작성해서 전달도 가능
        Arrays.sort(arr,desc);

        System.out.println("내림차순 정렬후 출력 : " + Arrays.toString(arr));

    }
    
}
