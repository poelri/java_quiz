package ch06.Quiz24;

public class Customer {
    private String name; //  성함
    private  String number;//  핸드폰번호
    private  String address; //  집주소
    int point; // 포인트

    public Customer(String name, String number, String address, int point) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
