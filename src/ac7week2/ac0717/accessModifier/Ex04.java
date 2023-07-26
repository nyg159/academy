package ac7week2.ac0717.accessModifier;

class Student {
    private String name;
    private int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    void showInfo(){
        System.out.printf("%s (%d점)\n",name,score);
    }

}
public class Ex04 {
    public static void main(String[] args) {

        Student stu = new Student("홍길동", 88);

        Student[] stus = new Student[] {
                stu,
                new Student("박민수", 75),
                new Student("김수진", 35)
        };
//
//
        stus[0].showInfo();
        stus[1].showInfo();
        stus[2].showInfo();
        System.out.println();

//        for










    }
}
