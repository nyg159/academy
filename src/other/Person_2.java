package other;

public class Person_2 {
    protected String name;

    protected int age;

    public Person_2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }





    public void eat(String food) {
        System.out.printf("%s 가 %s 를 먹습니다.\n", name, food);
    }

    public void showInfo() {
        String msg = "%s 는 (%d 세)\n";
        System.out.printf(msg,name,age);
    }
}
