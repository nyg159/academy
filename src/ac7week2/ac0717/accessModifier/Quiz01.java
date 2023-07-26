package ac7week2.ac0717.accessModifier;

import other.Ball;
import other.Child;

public class Quiz01 {
    public static void main(String[] args) {
        /*
            아래 클래스를 other 패키지에 작성
            필드는 모두 private 처리한다.
         */
        
        Child minsu = new Child("민수");  // 민수 (공 : x)
        Child jinho = new Child("진호");  // 진호 (공 : x)

        minsu.showInfo();
        jinho.showInfo();

        Ball base = new Ball("야구공");

        minsu.takeBall(base);

        minsu.showInfo();
        jinho.showInfo();

        minsu.throwBall(jinho);

        minsu.showInfo();
        jinho.showInfo();


    }
}
