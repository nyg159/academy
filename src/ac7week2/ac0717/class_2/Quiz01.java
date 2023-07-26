package ac7week2.ac0717.class_2;

class Po {
    int num1, num2, sum1,sum2;

    Po(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void showPo(){
        System.out.println("(" + this.num1 + ", " + this.num2 + ")");
    }


    Po addPo(Po a) {
        int x = this.num1 + a.num1;
        int y = this.num2 + a.num2;

        Po tmp = new Po(x, y);

        return tmp;
    }

}


public class Quiz01 {
    /*
           아래 코드가 실행 되게 클래스를 구현

           Po p1 = new Po(5,3);
           Po p2 = new Po(7,5);
           Po p3 = p1.addPo(p2);   -> p3 = p1 + p1
           p3.showPo();

        */
    public static void main(String[] args) {

        Po p1 = new Po(5,3);
        Po p2 = new Po(7,5);

        p1.showPo();
        p2.showPo();

        Po p3 = p1.addPo(p2);
        p3.showPo();


    }
}
