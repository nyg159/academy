package ac7week2.ac0717.class_2;

/*
            아래 코드가 동작하게 클래스 구현
        Person hong = new Person("홍길동");
        Car car = new Car("모닝");

        car.showCar();                      // 모닝 (0 km/h, x)

        car.accel(30);                      // 가속 메서드  단, 운전자가 없으면 동작 x

        car.takeOn(hong);                   // 자동차에 사람을 탑승 시키는 메서드
                                            // 홍길동이 모닝에 탑승

        car.showCar();                      // 모닝 (0 km/h, 홍길동)

        car.accel(30);                      // 30 km/h 가속
                                            // 모닝 (30 km/h, 홍길동)
         */
class Person{
    String name;

    Person(String name){
        this.name = name;
    }
}
class Car {
    String name;
    int speed = 0;

    Person people;

    Car(String name){
        this.name = name;
    }
    void showCar() {

        if (people == null){
            System.out.printf("%s (%d km/h, x)\n",name,speed);
            }else {
            System.out.printf("%s (%d km/h, %s)\n",name,speed,people.name);
        }
    }

    int accel(int a) {

        if (people == null) {
            System.out.printf("%s (%d km/h, x)\n",name,speed);

        }else {
            System.out.println(a+ " km/h 가속");
            speed += a;
            System.out.printf("%s (%d km/h, %s)\n",name,speed,people.name);
        }

        return speed;
    }

    void break_(int a) {
        int b = speed - a;

        if (people == null) {
            System.out.printf("%s 차량에 운전자가 존재하지 않습니다.\n", name);

        }else {
            if (b < 0 ) {
                System.out.println(a+ " km/h 감속");
                speed = 0;
                System.out.printf("%s (%d km/h, %s)\n",name,speed,people.name);
            }else {
                System.out.println(a+ " km/h 감속");
                speed -= a;
                System.out.printf("%s (%d km/h, %s)\n",name,speed,people.name);
            }
        }
    }



    void takeOn(Person people){
        this.people = people;

        System.out.println(people.name + " 이가 " + name +" 에 탑승했습니다.");

    }

    void takeOff(){
        if (speed == 0) {
            System.out.println(people.name + " 이가 " + name +" 에 하차 했습니다.");
            this.people = null;
        }else {
            System.out.printf("현재 %d km/h로 달리고 있어 하차가 불가능 합니다.\n",this.speed);
        }

    }


}
public class Quiz02 {
    public static void main(String[] args) {

        Person hong = new Person("홍길동");
        Car car = new Car("모닝");

        car.showCar();                      // 모닝 (0 km/h, x)

        car.accel(30);                      // 가속 메서드  단, 운전자가 없으면 동작 x

        car.takeOn(hong);                   // 자동차에 사람을 탑승 시키는 메서드
                                            // 홍길동이 모닝에 탑승

        car.showCar();                      // 모닝 (0 km/h, 홍길동)

        car.accel(30);                      // 30 km/h 가속
                                            // 모닝 (30 km/h, 홍길동)
        
        car.break_(20);                     // 20 감속
        
        car.takeOff();                      // 운전자 하자 메서드 속도가 0이 아니면 하차 불가능

        car.break_(20);

        car.takeOff();

    }
}
