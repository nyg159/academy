package ac7week2.ac0720.interface_1;

import java.util.Arrays;
import java.util.Comparator;

class Desc implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }

}
public class Ex03 {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{10, 50, 40, 20, 80, 90};

        System.out.println("arr = " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("arr = " + Arrays.toString(arr));

        Desc desc = new Desc();
        
        Comparator<Integer> desc2 = (Integer o1, Integer o2) -> {
            return o2 - o1;
        };
        // Comparator 는 함수형 인터페이스라 람다식으로 구현가능
        

        Arrays.sort(arr,desc);
        System.out.println("arr = "+ Arrays.toString(arr));

        /*
            순서!!!!
            1. 개발자가 sort() 메서드를 실행해서 정렬을 요구했다
            2. sort()는 개발자가 어떤 기준으로 비교하는지 알 수 없어 역으로 비교기준(Comparator) 를 요구
            이를 콜백(call - back) 이라고 한다.
            3. 따라서 개발자는 비교기준을 구현해서 전달하면 sort()가 비로소 정렬을 수행해준다.
            
         */


    }
}
