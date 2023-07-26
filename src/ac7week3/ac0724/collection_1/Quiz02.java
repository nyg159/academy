package ac7week3.ac0724.collection_1;

/*
        1. 학생정보를 입력 받는다. - 3명 입력 받고 국영수 점수도 입력 받는다.
        2. 입력 받은 정보로 Student 인스턴스 생성 및 리스트에 추가
        3. 성적순으로 출력
 */

import javax.swing.*;
import java.util.LinkedList;
import java.util.Scanner;

class Student {
    private String name;
    private int kor,eng, math,sum;


    Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.sum = (this.kor + this.eng + this.math);
    }

    public String toString() {
        return String.format("%s (국 : %d 영 : %d 수 : %d  평균 : %d)",name,kor,eng,math,sum);
    }

    public int getSum() {
        return sum;
    }

//    @Override
//    public int compareTo(Student o, Student o1) {
//        return o1.getSum()- o.getSum();
//    }
}
public class Quiz02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        for (int i = 0; i < 3; i++) {
            System.out.printf("%d번 학생의 정보를 입력하세요 (이름, 국, 영, 수): ",i);
            String name = scanner.next();
            int kor = scanner.nextInt();
            int eng = scanner.nextInt();
            int math = scanner.nextInt();


            list.add(new Student(name,kor,eng,math));

        }

        System.out.println(list);
        list.sort(null);
        System.out.println(list);
//        list.sort((Student o1, Student o2)->{
//            return (int) (o1.getSum()-o2.getSum());
//        });

        scanner.close();
    }
}

