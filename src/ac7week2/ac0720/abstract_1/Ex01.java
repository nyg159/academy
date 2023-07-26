package ac7week2.ac0720.abstract_1;

import other.Figure;

/*
    other.Figure 클래스가 추상클래스
 */

class Triangle extends Figure {
    // 오버라이드를 강제로 하게 만듬 아니면 상속도 못받음

    @Override
    public void draw() {
        System.out.println("삼각형을 그린다.");

    }
}

class Square extends Figure {
    @Override
    public void draw() {
        System.out.println("사각형을 그린다.");
    }
}

class Circle extends Figure {

    @Override
    public void draw() {
        System.out.println("원을 그린다.");
    }
}


public class Ex01 {
    public static void main(String[] args) {
//        Figure figure = new Figure();
//        추상클래스는 인스턴스 생성 불가

        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();


        triangle.show();        // 문제되지 않음 이미 구현이 되어 있기 때문
        triangle.draw();        // 추상 메서드는 무조껀 구현 해야한다.
        System.out.println();

        Figure figure = triangle;       // 참조변수로는 가능하다. -> 업케스팅

        Figure[]figures=new Figure[]{
                triangle,square,circle
        };
        // 추상 클래스는 실체화(= 인스턴스)가 불가능 하지만
        // 개념은 존재한다. 따라서 참조변수는 사용 가능

        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }



    }
}
