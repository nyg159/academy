package ac7week3.ac0724.collection_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/*
        로또 추첨기를 만들어라
        1. 1 ~ 45 숫자를 무작위로 중복 없이 6개를 뽑는다.
        2. 낮은 숫자 부터 출력한다.
 */
public class Quiz01 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("구입할 로또 장수를 입력해주세요 : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {

            while (set.size() != 6) {
                set.add(random.nextInt(45)+1);

            }
            arrayList.clear();
            arrayList.addAll(set);
            arrayList.sort(null);
            System.out.println(arrayList + "\n");
            set.clear();

        }
    }
}
