package ac7week2.ac0720.abstract_1;

class Pc {

    void connect(Keyboard key) {
        key.run();
    }

    void connect(Disk disk) {
        disk.run();
    }

    void connect(Phone phone) {
        phone.run();
    }
}

class Keyboard {
    void run() {
        System.out.println("장치 발견, 장치를 설치합니다.");
        System.out.println(" 키보드가 활성화 되었습니다.");
    }
}

class Disk {
    void run() {
        System.out.println("E:\\에 연결 되었습니다.");
        System.out.println("사용 가능한 용량 982GB");
    }
}

class Phone {
    void run() {
        System.out.println("휴대폰이 감지 되었습니다.");
        System.out.println("갤러리를 열까요?");
    }
}
public class Ex04 {
    public static void main(String[] args) {
        Pc pc = new Pc();

        Keyboard keyboard = new Keyboard();

        Disk disk = new Disk();

        Phone phone = new Phone();

        pc.connect(keyboard);           // 연결을 하려면 계속 class pc 에서 connect 메서드를 만들어야 한다. 오버로딩을 계속 해줘야함
        pc.connect(disk);
        pc.connect(phone);

        
    }
}
