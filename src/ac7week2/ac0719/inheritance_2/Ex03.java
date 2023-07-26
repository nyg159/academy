package ac7week2.ac0719.inheritance_2;
/*
        클래스 간에는 상속 관계일때 서로 형변환이 가능하다
        
        1. up-casting   : 자식 인스턴스를 부모로 참조하는 경우
        
        2. down-casting : 업 캐스팅된 인스턴스를 다시 자식으로 참조하는 경우

 */


import other.Person_2;

public class Ex03 {
    public static void main(String[] args) {
        Student stu = new Student("김수진", 17, 85);
        Police police = new Police("박철수", 37, "경감");


        // 업 캐스팅 : 자식 인스턴스를 부모로 참조
        Person_2 per1 = stu;
        Person_2 per2 = new Police("박철수", 37, "경감");

        // 특징 1. 보모의 맴버는 그래도 사용가능
        per1.showInfo();
        per2.showInfo();

        // 특징 2. 원래 자식의 맴버는 사용 불가능
//        per1.study("python");
//        per2.patrol("해운대구");

        // 다운 캐스팅 : 업 캐스팅된 인스턴스를 다시 원래 타입으로 참조
        Student tmp = (Student) per1;   // 강제 형변환 (자료형) 이름

        // 특징 1. 원래 자식의 맴버를 다시 참조할 수 있게 된다.
        tmp.study("Python");



        ((Police)per2).patrol("해운대구");

        // 특징 2. 원래 타입과 다른 타입으로 변환하면 에러
        //        Student tmp1 = (Student) per2;
//        오류 발생 다시 다운 캐스팅 할때 원래 타입으로 변형 해야함



    }
}
