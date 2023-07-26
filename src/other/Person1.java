package other;

public class Person1 {
    // protected : 자식까지 접근 가능
    protected String name;
    protected int age;

    public Person1(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void eat(String food) {
        String msg = "%s (이)가 %s 를 먹는다.\n";
        System.out.printf(msg,name,food);
    }

    public void showInfo() {
        String msg = "%s (%d 세)\n";
        System.out.printf(msg,name,age);
    }


}
