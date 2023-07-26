package ac7week2.ac0718.static_1;
/*

 */

class People {
    private String name;
    private int age;

    private static int eyes = 2;

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static int getEyes() {// static 작성 필요
//        age = 30;                 // 정적 맴버는 일반 맴버를 참조할 수 없다. 
//        그 이유는 인스턴스가 없어도 정적맴버는 사용이 가능한데 일반 맴버는 인스턴스가 있어야 생성되기 때문이다
        return eyes;
    }

    public static int setEyes(int eyes) {
//        this.eyes = eyes;                  정적 메서드에는 this 를 사용 할 수 없다. this 는 인스턴스를 구분하기 위해 사용한다.
        People.eyes = eyes;                 // 이렇게 작성 해야 한다.

        return eyes;
    }

    void showInfo() {
        String msg = "%s (%d 세 눈 %d 개)\n";
        System.out.printf(msg,name,age,eyes);
    }
    
}


public class Ex02 {
    public static void main(String[] args) {
        // 정적 맴버는 인스턴스가 겂어도 사용가능
        // 클래스 자체의 맴버이므로 클래스만 있으면 바로 사용 가능
        System.out.println("사람의 눈 개수 : "+ People.getEyes());

        People p1 = new People("김민수", 33);
        People p2 = new People("박기량", 40);
        People p3 = new People("이대호", 29);
        
//        People.eyes = 3;                          private 라 접근 불가 setter 필요
        People.setEyes(3);                      // setter 사용

        p1.showInfo();
        p2.showInfo();
        p3.showInfo();

    }
}
