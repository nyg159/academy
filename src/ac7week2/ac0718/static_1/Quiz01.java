package ac7week2.ac0718.static_1;
//       이것에 맞게 코드를 작성 하라
//        Student stu1 = new Student("홍길동", 80);
//
//        stu1.showInfo();                            // 홍길동 (80점) - 1명     출력
//
//
//        Student stu2 = new Student("김수진", 77);
//        stu2.showInfo();                            // 김수진 (77점) - 2명
//
//        Student stu3 = new Student("이진호", 93);
//        stu3.showInfo();                            // 이진호 (93점) - 3명
//
//        System.out.println("현재 학급 인원? " + Student.getCount());
//
//        stu1.showInfo();                // 홍길동 (80점) - 3명
//        stu2.showInfo();                // 김수진 (77점) - 3명
//        stu3.showInfo();                // 이진호 (93점) - 3명

class Student {
    private String name;

    private int point;

    private static int count = 0;

    Student(String name,int point) {
        this.name = name;
        this.point = point;
        count += 1;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {        //일반 맴버 에서는 this 를 사용
//        this.name = name;
//    }

    void showInfo() {
        System.out.println(name + " ("+point+" 점) - "+count+" 명");
    }

    public static int getCount() {
        return count;
    }
}

public class Quiz01 {
    public static void main(String[] args) {

        Student stu1 = new Student("홍길동", 80);

        stu1.showInfo();                            // 홍길동 (80점) - 1명     출력


        Student stu2 = new Student("김수진", 77);
        stu2.showInfo();                            // 김수진 (77점) - 2명

        Student stu3 = new Student("이진호", 93);
        stu3.showInfo();                            // 이진호 (93점) - 3명

        System.out.println("현재 학급 인원? " + Student.getCount() + " 명");

        stu1.showInfo();                // 홍길동 (80점) - 3명
        stu2.showInfo();                // 김수진 (77점) - 3명
        stu3.showInfo();                // 이진호 (93점) - 3명


    }
}
