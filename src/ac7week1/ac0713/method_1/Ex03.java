package ac7week1.ac0713.method_1;


/*
        1.전달인자와 매개변수는 개수 및 자료형을 일치시킨다.
        2. 매개변수에는 전달인자가 순서대로 저장된다.
 */
public class Ex03 {

    static void adder(int n1, int n2){
        int sum = n1 + n2;

        System.out.printf("n1 = %d, n2 = %d, \n",n1,n2);
        System.out.print("합계 : " + sum + "\n");
    }

    public static void main(String[] args) {
        adder(10,20);

        adder(20,10);


    }
}
