package ac7week2.ac0717.class_2;

class child {
    String name;
    Ball ball;

    child(String name) {
        this.name = name;
    }

    void showInfo() {
        String type = (ball == null) ? "없음" : ball.type;        // 이 문법 나중에 확인 해보자
        System.out.printf("%s (공 : %s)\n", name, type);
    }

    void takeBall(Ball ball) {
        this.ball = ball;

        System.out.printf("%s 가 %s 를 얻었다\n",name,ball);   // 이렇게 출력하면 ball 은 해쉬 코드가 출력된다.
        System.out.printf("%s 가 %s 를 얻었다\n",name,ball.type);
    }

    void throwBall(child child){

        child.ball = ball;
        System.out.printf("%s 가 %s 에게 %s 를 던졌다", name, child.name, ball.type);
        ball = null;


    }

}

class Ball {
    String type;

    Ball(String type) {
        this.type = type;
    }

}



public class Ex02 {
    public static void main(String[] args) {

        child minsu = new child("민수");
        child junho = new child("준호");

        minsu.showInfo();
        junho.showInfo();

        Ball base  = new Ball("야구공");
        minsu.takeBall(base);

        minsu.throwBall(junho);

        minsu.showInfo();
        junho.showInfo();

    }
}
