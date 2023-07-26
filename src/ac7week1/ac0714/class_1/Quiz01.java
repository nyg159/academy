package ac7week1.ac0714.class_1;

class Car {
    String name;
    int speed;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void showCar() {
        System.out.printf("%s (%d km/h)\n",name,speed);
    }

    void accel(int speed) {
        this.speed += speed;
        System.out.println(speed + " km/h 가속");
        showCar();                                      // this.showCar();
    }

    void break_(int speed) {
        this.speed -= speed;
        System.out.println(speed + " km/h 감속");
        showCar();                                      // this.showCar();

    }
}

public class Quiz01 {
    public static void main(String[] args) {
        // 아래 코드가 실행되게 클래스를 작성한다.

        Car car = new Car("모닝",0);          // 필드 : 차량모델명, 속도

        car.showCar();                       // 모닝(0 km/h)

        car.accel(30);                       // 30km/h 가속
        car.showCar();                       // 모닝(30 km/h)

        car.accel(20);                       // 20km/h 가속
        car.showCar();                       // 모닝(50 km/h)

        car.break_(15);                      // 15km/h 감속
        car.showCar();                       // 모닝(35 km/h)

    }
}
