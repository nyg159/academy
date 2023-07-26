package ac7week2.ac0717.accessModifier;
class Car{
    private String model;
    private int speed = 0;

    private int n = 4;                      // 좌석수
    private Human[] sits = new Human[n];     // 좌석 (0번이 운전석)


    Car(String model) {
        this.model = model;

    }

    
    public void showCar(){
        System.out.printf("%s %d km/h ",model,speed);
        System.out.print("탑승객 : ");
        for (int i = 0; i < sits.length; i++) {
            String name = (sits[i] == null) ? "빈좌석" : sits[i].getName();
            System.out.printf("(%s), ", name);
        }
        System.out.println();
    }

    public void rideOn(Human human, int num) {
        if (num >= n || num < 0) {
            System.out.println("존재 하지 않는 좌석입니다.");
            return;
        }
        if (sits[num] != null) {
            System.out.println("빈좌석이 아닙니다.");
            return;
        }
        sits[num] = human;

        System.out.println(human.getName() + " 님 탑승");

//        this.name = human;
//
//        for (int i = 0; i <= num; i++){
//            if (i == n && sits[i] == null) {
//                sits[i] = name;
//                System.out.printf("%s 이가 %d 번 자리에 탑승했습니다.\n",name,getSits());
//                return;
//            }
//        }
    }

    void accel(int speed) {
        if (sits[0] == null) {
            System.out.println("운전자가 없습니다!!!!");
            return;
        }
        this.speed = speed;

        System.out.println(speed + " km/h 가속");
        showCar();
    }

    void break_(int speed) {
        if (sits[0] == null) {
            System.out.println("운전자가 존재하지 않아 감속 할 수 없습니다.!!!");

        } else if (this.speed - speed <= 0) {
            this.speed = 0;
            System.out.println(speed + " km/h 감속하여 현재 속도는 " + this.speed + " km/h 입니다.");

        } else {
            this.speed -= speed;
            System.out.println(speed + " km/h 감속하여 현재 속도는 " + this.speed + " km/h 입니다.");
        }
    }

    void rideOff(int number) {
        if (speed != 0) {
            System.out.println("정차후 하차해주세요. 현재 속도는 " + this.speed + " km/h 입니다.");
            return;
        }

        if (sits[number] == null) {
            System.out.println("현재 좌석에는 탑승자가 존재하지 않습니다.");
        } else {
            System.out.println(sits[number].getName() + " 님이 하차 하였습니다.");
            sits[number] = null;
            showCar();
        }
    }
}

class Human {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Human(String name) {
        this.name = name;
        System.out.println(name);
    }

}



public class Quiz02 {
    public static void main(String[] args) {
        System.out.println();

        Car car = new Car("아우디");
        System.out.println();
        Human h1 = new Human("홍길동");
        Human h2 = new Human("박민수");

        car.rideOn(h1, 0);                         // 자동차에 사람이 탑승
        car.rideOn(h2,0);                          // 지정한 자리(0)에 탑승 시킨다
                                                        // 이미 사람이 있다면 경고를 출력
        car.rideOn(h2,4);                          // 없는 좌석 선택시 오류

        car.rideOn(h2,2);

        car.showCar();                                  // 모델명 속도 탑승자들을 출력

        car.accel(30);                            // 가속 메서드, 운전자가 없으면 가속 불가

        car.break_(20);                                 // 감속 메서드,
                                                        // 운전자가 없으면 감속 불가

        car.rideOff(2);                                 // 지정 좌석 하차
                                                        // 단, 속도가 0이 아니면 하차 불가
    }
}
