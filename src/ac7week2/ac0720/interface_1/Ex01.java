package ac7week2.ac0720.interface_1;

/*
        abstract_1.Ex04 랑 비교 해보세요
 */

class PC {
    void connect(USB usb) {
        usb.run();
    }

}

class Keyboard implements USB{

    @Override
    public void run() {
        System.out.println("장치 발견, 장치 드라이브를 설치합니다.");
        System.out.println("키보드가 활성화 되었습니다.");
    }
}

class Disk implements USB {

    @Override
    public void run() {
        System.out.println("E:\\에 연결되었습니다.");
        System.out.println("사용 가능한 용량 982GB");
    }
}

class Phone implements USB {

    @Override
    public void run() {
        System.out.println("휴대폰이 연결 되었습니다.");
    }
}


interface USB {
    void run();
}

public class Ex01 {
    public static void main(String[] args) {
        PC pc = new PC();
        Keyboard keyboard = new Keyboard();
        Disk disk = new Disk();
        Phone phone = new Phone();

        pc.connect(keyboard);
        pc.connect(disk);
        pc.connect(phone);









    }
}
