package ac7week3.ac0727.testJava;

class Member {
    String id,pw,name;
    Member(String id,String pw ,String name){
        this.id = id;
        this.pw = pw;
        this.name = name;

    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

}
class Seller extends Member{
    String shopName;

    Seller(String id, String pw, String name,String shopName) {
        super(id, pw, name);
        this.shopName = shopName;

    }

    public String toString() {
        return String.format("판매자 ID : %s 이름 : %s 가게이름 : %s", id, name, shopName);
    }
}

class Customer extends Member{
    String address;

    Customer(String id, String pw, String name,String address) {
        super(id, pw, name);
        this.address = address;
    }

    public String toString() {
        return String.format("구매자 ID : %s 이름 : %s 주소 : %s", id, name, address);
    }
}

