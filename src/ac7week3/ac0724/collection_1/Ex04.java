package ac7week3.ac0724.collection_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {

        Integer[] arr1 = new Integer[]{10, 20, 30, 40, 50};
//        List<Integer> list = Arrays.asList(arr1);
        // 인스턴스 생성 없이 바로 받으면 리스트 내부 수정이 불가능 크기가 고정 된다.

        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));

//        list.add(60);
//        System.out.println("list : "+ list);

        list1.add(60);
        System.out.println("list1 : "+ list1);
        
        
        
        /*
        리스트의 반복
        1. 일반 for 문
         */
        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("list[%d] = %d\n",i,list1.get(i));
        }
        System.out.println();
        
        // 2. for - each 문 : 앞의 요소를 하나씩 변우세 대입하며 반복
        // index 가 없는 구조를 순환 할때 사용할 수 있다.

        for (int n : list1) {
            System.out.println("n = " + n);
        }
        System.out.println();


        // 3. iterator : 순환자, 반복자           장점 : 가벼움
        // 요소를 가리키고 있는 커서(cursor) 개념

        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()) {  //  .hasNext() 커서는 이동하지 않고 다음 요소가 있으면 true

            int number = it.next();     // next() 커서를 이동후, 그 위치의 요소를 반환
            
            System.out.println("number = " + number);
            
        }                       // 반복이 끝난다고 해서 iterator 는 재위치로 돌아가지 않음
                                // 다시 순환 하려면 collection 으로 다시 받아야 함

        System.out.println("it 다음 ?" + it.hasNext());

        it = list1.iterator();
        System.out.println("it 다음 ?" + it.hasNext());



        
    }
}
