package ac7week2.ac0719.inheritance_2;

/*
        아래 코드가 실행 되게 만들어라

        Student student = new Student("홍길동", 19, 93);
        Police police = new Police("이민철", 20, "경장");

        Doctor doctor = new Doctor("이국종", 68, "외과");

        doctor.showInfo();      // 이국종 (68세 내과의)

        doctor.cure(student);   // 의사가 '사람'을 치료하는 메서드
                                // 내과의 이국종이 홍길동을 치료한다.
                                // Person 에 필요하면 access 메서드를 만든다

        doctor.cure(police);

 */

import other.Person_2;

class Doctor extends Person_2 {
    private String major;


    protected Doctor(String name, int age, String major) {
        super(name,age);
        this.major = major;
    }

    public void showInfo() {
        String msg = "%s (%d 세 %s의)\n";
        System.out.printf(msg,name,age,major);
    }

    public void cure(Person_2 people) {
        Person_2 per1 = people;
        String msg ="%s의 %s 이가 %s 을를 치료한다.\n";
        if (per1 instanceof Person_2) {
            if (per1 instanceof Student) {
                Student person_name = (Student) per1;
                System.out.printf(msg,major,name,person_name.getName());
            } else if (per1 instanceof Police) {
                Police person_name = (Police) per1;
                System.out.printf(msg,major,name,person_name.getName());
            }else {
                System.out.println("직업을 모르겠습니다.");
            }
        }else {
            System.out.println("사람이 아니무니다.");
        }

    }

}
public class Quiz01 {
    public static void main(String[] args) {

        Student student = new Student("홍길동", 19, 93);
        Police police = new Police("이민철", 20, "경장");

        Doctor doctor = new Doctor("이국종", 68, "외과");

        doctor.showInfo();      // 이국종 (68세 내과의)

        doctor.cure(student);   // 의사가 '사람'을 치료하는 메서드
                                // 내과의 이국종이 홍길동을 치료한다.
                                // Person 에 필요하면 access 메서드를 만든다

        doctor.cure(police);



    }
}
