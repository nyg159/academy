package testJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Controller {
    private Scanner scanner = new Scanner(System.in);

    private LinkedList<Member> linkedList = new LinkedList();


    int verification(String id) {
        // 아이디를 찾아서 index 번호를 리턴 하는 메서드
        // 회원가입 중복과 회원탈퇴 할때 회원을 찾을때 아이디를 비교해서 해당 index 를 리턴한다.

        int index = -1;
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getId().equals(id)) {
                index = i;

                return index;
            }
        }
        return index;
    }

    void joinMembership() {
        // 회원가입 -> 아이디 중복이 발생 하지 않아야 함 리스트 크기는 무제한
        System.out.println("--------회원가입---------");
        System.out.print("판매자는 숫자 1 구매자는 숫자 2를 눌러주세요 : ");
        int member = scanner.nextInt();
        if (member == 1) {
            // 판매자는 숫자 1을 받으면 판매자 데이터를 입력 받게 했습니다.
            
            System.out.println("판매자 정보를 입력해 주세요. (ID,PassWord, 이름, 가게이름)");
            System.out.print("아이디 : ");
            String sellerId = scanner.next();
            System.out.print("비밀번호 : ");
            String sellerPw = scanner.next();
            System.out.print("이름 : ");
            String sellerName = scanner.next();
            System.out.print("가게이름 : ");
            String sellerMallName = scanner.next();

            int n = verification(sellerId);
            // 아이디가 중복이 있는지 확인 하는 메서드

            if (n > 0) {
                System.out.println("\n입력하신 아이디가 존재합니다.\n");

            }else {
                linkedList.add(new Seller(sellerId,sellerPw,sellerName,sellerMallName));

            }

        } else if (member == 2) {
            // 구매자는 숫자 2를 받으면 구매자 데이터를 입력 받게 했습니다.
            System.out.println("구매자 정보를 입력해 주세요. (ID,PassWord, 이름, 배송주소)");
            System.out.print("아이디 : ");
            String customerId = scanner.next();
            System.out.print("비밀번호 : ");
            String customerPw = scanner.next();
            System.out.print("이름 : ");
            String customerName = scanner.next();
            System.out.print("배송주소 : ");
            String customerAddress = scanner.next();

            int n = verification(customerId);
            // 아이디 중복 확인 메서드
            
            if (n > 0) {
                System.out.println("\n입력하신 아이디가 존재합니다.\n");

            }else {
                linkedList.add(new Customer(customerId,customerPw,customerName,customerAddress));

            }

        }else {
            System.out.println("잘못된 숫자 입력입니다.\n");

        }
        System.out.println();
    }

    void membershipWithdrawal() {
        // 2. 회원 탈퇴
        System.out.print("탈퇴하고 싶은 아이디를 입력하세요 : ");
        String deleteId = scanner.next();
        System.out.println();

        int deleteIdIndex = verification(deleteId);
        // 아이디가 존재하는지 확인 하고 존재 한다면 해당 인덱스를 리턴해줌
        // 리턴 받은 인덱스를 사용하여 회원 삭제

        if (deleteIdIndex < 0) {
            System.out.println("입력하신 아이디가 존재하지 않습니다.");

        }else {
            System.out.println(deleteId + " (은)는 탈퇴 되었습니다.");
            linkedList.remove(deleteIdIndex);
        }

        System.out.println();

    }

    void listPrinting() {
        // 3. 전체 목록 출력
        // 전체 리스트를 출력합니다.
        System.out.println("---------회원 목록---------");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i +". "+ linkedList.get(i).toString());
        }

        System.out.println();


    }

    void searchInfo() {
        // 4. 단일 검색 
        // -> 입력받은 아이디를 verification() 메서드를 이용하여 아이디와 일치하는 객체를 출력한다.
        System.out.print("검색할 아이디를 입력해 주세요 : ");
        String searchId = scanner.next();

        int numberIndex = verification(searchId);
        System.out.println(linkedList.get(numberIndex));
        System.out.println();

    }

    void sortList() {
        // 5. 리스트 정렬 -> 정렬 기준은 ID 기준 오름차순으로 정렬 한다.
        //

        linkedList.sort((Member o1, Member o2)->{
            return o1.getId().compareTo(o2.getId());
        });

    }


    public void run() {
        int menu;
        do {
            System.out.println("--------- 매뉴---------");
            System.out.println("\t 1. 회원가입");
            System.out.println("\t 2. 회원탈퇴");
            System.out.println("\t 3. 전체목록 출력");
            System.out.println("\t 4. 단일검색");
            System.out.println("\t 5. 정렬");
            System.out.println("\t 0. 프로그램 종료");
            System.out.println(linkedList);

            System.out.print(">>>>");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    joinMembership();
                    break;

                case 2:
                    membershipWithdrawal();
                    break;

                case 3:
                    listPrinting();
                    break;
                case 4:
                    searchInfo();
                    break;

                case 5:
                    sortList();
                    break;
            }

        } while (menu != 0);

        scanner.close();
    }
}
