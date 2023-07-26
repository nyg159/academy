package ac7week3.ac0724.collection_1;

import java.util.Enumeration;
import java.util.Vector;

public class Ex05 {
    public static void main(String[] args) {
        // vector 는 자바 초기 버전에서 사용하던 컬랙션
        // 지금은 잘 사용되지 않고, 하위 자바 버번과 호환성을 위해서 남겨둠

        Vector vector = new Vector();

        vector.add(10);
        vector.add(20);
        vector.add(30);

        System.out.println("vector = " + vector);

        Enumeration<Integer> elements = vector.elements();      // iterator 옛 버전

        while (elements.hasMoreElements()) {

            int n = elements.nextElement();
            System.out.println("n = " + n);

        }


    }
}
