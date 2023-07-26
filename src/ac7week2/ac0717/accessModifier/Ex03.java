package ac7week2.ac0717.accessModifier;
class People{
    // 필드는 가급적 private 로 처리
    private String name;
    private int age;

    People(String name,int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.printf("%s (%d 세)\n",name,age);
    }

    // 외부에서 private 맴버가 필요할 때가 있다.
    // 이때 간접적으로 접근하게 제공하는 메서드를 Access Method 라고 한다.
    // getter setter
    // 화이트 리스트 방법
    /*
        1. setter : 필드의 값을 변경하는 메서드
        
        
     */
    
    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //      2. getter : 필드의 값을 반환 하는 메서드
    String getName() {
        return name;
    }

}
public class Ex03 {
    public static void main(String[] args) {
        People per = new People("이수진",25);

        per.showInfo();

//        per.name = "박수현";
        per.setName("박수현");

        per.showInfo();

        System.out.println("per 이름 : "+ per.getName());
//        System.out.println("per 이름 : "+ per.name());  윗 코드줄과 같음

    }
}
