package other;



public class Child {
    private String name;
    private Ball ball;

    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public void showInfo() {
        if (ball == null) {
            System.out.printf("%s (공 : x)\n",name);
        } else {
            System.out.printf("%s (공 : %s)\n",name,ball.getBallName());
        }

    }

    public void takeBall(Ball ball) {
        this.ball = ball;
        String msg = "%s 가 %s 를 주웠다\n";
        System.out.printf(msg,name,ball.getBallName()); // 이렇게 해도 됨
        System.out.printf("%s 가 %s 를 주웠다\n", name, ball.getBallName());

    }

    public void throwBall(Child child) {

        String msg = "%s 가 %s 에게 %s 를 던졌다\n";
        System.out.printf(msg,name,child.name,ball.getBallName());

        child.ball = ball;
        ball = null;


    }


}



