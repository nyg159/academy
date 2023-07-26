package ac7week2.ac0721.interface_2;

/*
        아래 클래스를 작성후 성적 순으로 내림차순

        Student[] students = new Student[]{
                new Student("홍길동", 70, 80, 98),
                new Student("김민지", 90, 77, 85),
                new Student("박철민", 88, 91, 70)
        };
 */

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student>{
    private String name;
    private int kor, math, eng;
    private double avg;

    Student(String name,int kor, int math, int eng) {
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        avg = (kor + math + eng)/3;
    }

    public int getKor() {
        return kor;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    public double getAvg() {
        return avg;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + ", 평균 : " + avg
                + "(국 : " + kor + ", 수 : " + math + ", 영 : " + eng + ")";
    }


    @Override
    public int compareTo(Student o1){
        return (int)this.avg - (int) o1.avg;
    }
}
public class Quiz02 {
    public static void main(String[] args) {

        Student[] students = new Student[]{
                new Student("홍길동", 70, 80, 98),
                new Student("김민지", 90, 77, 85),
                new Student("박철민", 88, 91, 70)
        };

        System.out.println("학생 배열 출력 : "+ Arrays.toString(students));
        System.out.println();

        Arrays.sort(students);
        System.out.println("학생 배열 성적순 오름차순 출력 : "+ Arrays.toString(students));

        Comparator<Student> desc = (Student o1, Student o2) -> {
            double o22 = o2.getAvg();
            double o11 = o1.getAvg();
        return (int)o22 - (int)o11;
        };

        System.out.println();
        Arrays.sort(students,desc);
        System.out.println("학생 배열 성적순 내림차순 출력 : "+ Arrays.toString(students));


    }
}
