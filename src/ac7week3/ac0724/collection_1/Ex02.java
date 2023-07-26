package ac7week3.ac0724.collection_1;

/*
        1
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        // 인터페이스는 인스턴스를 생성 할 수 없기 때문에 자식 클래스를 만들어 사용한다.
        // 사용 방식에는 차이가 없다.

        List<Double> list = new ArrayList<>();  // 업케스팅

        list.add(1.2);
        list.add(5.88);
        list.add(3.141592);

        System.out.println("list = " + list);

        list.sort(null);    // null 넣으면 Comparable 을 사용한다. 오름차순이 된다.
        System.out.println("list = " + list);


        // 람다식으로 Comparator 을 구현
        list.sort((Double o1, Double o2)->{
            return o2.compareTo(o1);
        });
        System.out.println("list = " + list);


        Comparator<Double> desc = new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return 0;
            }
        };

        list.sort(desc);
        System.out.println("list = " + list);



    }
}
