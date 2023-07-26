package ac7week2.ac0719.inheritance_2;

/*
        아래 코드들을 실행 시키게 만들어 보아라
        Student student = new Student("홍길동", 19, 93);
        Police police = new Police("이민철", 20, "경장");
        Doctor doctor = new Doctor("이국종", 68, "외과");

        Person_2 person_2 = new Person_2("박수진", 30);
        
        Airplane airplane = new Airplane();
        
        air.rideOn(student);        // 비행기에 '사람'이 탑승
        air.rideOn(police);         // 좌석이 부족하면 탑승 불가능
        air.rideOn(doctor);         
        air.rideOn(person_2);
        
        air.list();                 // 탑승객 목록을 출력
 */
import other.Person_2;


class Airplane {
    private int num = 3;        // 좌석수

    private Person_2[] sits = new Person_2[num];     // 좌석 배열

    private int number = 0;


//  내가 짠 코드
//    void rideOn(Person_2 person2){
//        int count= 0;
//        String msg = "%s 님이 비행기에 탑승했습니다.\n";
//        for (int i = 0; i < sits.length; i++) {
//
//            if (sits[i] == null) {
//                count++;
//            }
//        }
//
//        if (count != 0) {
//            Person_2 people = person2;
//            if (people instanceof Person_2) {
//                if (people instanceof Student){
//                    Student student = (Student) people;
//                    System.out.printf(msg,student.getName());
//                    sits[number] = student.getName();
//
//                } else if (people instanceof Police) {
//                    Police police = (Police) people;
//                    System.out.printf(msg,police.getName());
//                    sits[number] = police.getName();
//
//                } else if (people instanceof Doctor) {
//                    Doctor doctor = (Doctor) people;
//                    System.out.printf(msg,doctor.getName());
//                    sits[number] = doctor.getName();
//
//                }else {
//                    System.out.printf(msg,people.getName());
//                    sits[number] = people.getName();
//                }
//
//            }
//        }else {
//            System.out.println("비행기 좌석이 매진입니다.");
//        }
//        number++;
//    }

    void rideOn2(Person_2 person2) {
        for (int j = 0; j < sits.length; j++) {

            if (sits[j] == null) {
                System.out.println(person2.getName() + " 님 탑승");
                sits[j] = person2;
                return;
            }
        }
        System.out.println("빈 좌석이 없습니다.");
    }


    void list() {
        for (int i = 0; i < sits.length; i++) {

            System.out.println(i + 1 +" 번 좌석 : "+ sits[i].getName() + " ");
        }
    }

    void emergency(Person_2 person2) {
        System.out.println("긴급상황!!! 기내에서 의사를 찾습니다.");
        for (int i = 0; i < num; i++) {
            if (sits[i] instanceof Doctor) {
                Doctor doctor = (Doctor) sits[i];
                doctor.cure(person2);

                return;
            }
        }
        System.out.println("비행기 안에 의사가 존재하지 않습니다.");
    }
}


public class Quiz02 {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 19, 93);
        Police police = new Police("이민철", 20, "경장");
        Doctor doctor = new Doctor("이국종", 68, "외과");

        Person_2 person_2 = new Person_2("박수진", 30);
        
        Airplane air = new Airplane();
        
        air.rideOn2(student);        // 비행기에 '사람'이 탑승
        air.rideOn2(police);         // 좌석이 부족하면 탑승 불가능
        air.rideOn2(doctor);
        air.rideOn2(person_2);
        
        air.list();                 // 탑승객 목록을 출력

        air.emergency(student);         // 긴급 상황 메서드
                                    // 기내에 의사를 찾아서 전달된 사람을 치료
                                    //만약 의사가 없으면 없다고 출력
        
    }
}
