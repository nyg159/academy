package ac7week2.ac0717.class_2;

class Unit {
    String name;
    int atk, hp;

    public Unit(String name,int atk, int hp) {
        this.name = name;
        this.atk = atk;
        this.hp = hp;
    }

    void showInfo() {
        System.out.printf("%s (%d, hp %d)\n",name,atk,hp);
    }

    void attack(Unit tar) {
        tar.hp -= atk;

        System.out.printf("%s 가 %s 를 공격한다.\n",this.name,tar.name);
        System.out.println(atk + " 만킁의 피해를 줬다.");
        showInfo();                         // this.showInfo(); => war.showInfo();
        tar.showInfo();                     // tar.showInfo(); => wiz.showInfo();
    }

}

public class Ex01 {
    public static void main(String[] args) {
        Unit war = new Unit("전사", 10, 100);
        Unit wiz = new Unit("마법사", 15, 70);

        war.showInfo();
        wiz.showInfo();
        
//        상호작용 : 객체 간의 발생하는 동작 / 행위를 의미
        war.attack(wiz);    // Unit 객체 간에 공격하라는 상호작용을 구성
        wiz.attack(war);

    }
}
