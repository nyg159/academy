package ac7week2.ac0719.inheritance_2;


import other.Person_2;

class Police extends Person_2 {
    private String job;

    protected Police(String name, int age, String job) {
        super(name,age);
        this.job = job;
    }

    public void showInfo() {
        super.showInfo();

        String msg = "%s 는 (%d 세 직업 : %s)\n";
        System.out.printf(msg,name,age,job);
    }

    public void patrol(String area) {
        String msg = "%s %s 이가 %s 를 순찰합니다.\n";
        System.out.printf(msg,name,job,area);
    }

}

public class Ex02 {
    public static void main(String[] args) {

        Police police = new Police("김수빈", 30, "순경");

        police.showInfo();

        police.eat("빵");

        police.patrol("센텀시티");

    }
}
