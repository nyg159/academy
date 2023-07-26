package ac7week2.ac0720.poiymorphim_1;


/*
        다형성 : 다양한 형태를 가진다는 의미
        1개의 명령으로 여러개의 명령을 내리게 한다.
        
        다형성을 구현하기 위한 조건
        
        1. 상속
        2. 오버라이딩

 */
class Figure {
    void draw() {
        System.out.println("도형을 그린다.");
    }
}

class Triangle extends Figure{
    @Override
    void draw() {
        System.out.println("삼각형을 그린다.");
    }
}

class Square extends Figure {
    @Override
    void draw() {
        System.out.println("사각형을 그린다.");
    }
}

class Circle extends Figure {
    @Override
    void draw() {
        System.out.println("원을 그린다.");
    }
}


// 동적 바인딩
public class Ex01 {
    public static void main(String[] args) {

        Figure figure = new Figure();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();

        // 업 케스팅으로 자식 객체를 묶어준다.
        Figure[] figures = new Figure[]{figure, triangle, square, circle};

        // 묶은 도형들에게 그리라는 명령을 내린다.
        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
            // 업 케스팅이 되더라도
            // 자식에서 오버라이드가 된 메서드가 실행됨

        }


    }
}
