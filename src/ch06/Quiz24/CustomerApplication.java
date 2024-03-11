package ch06.Quiz24;

import java.util.Scanner;

public class CustomerApplication {
    //private: CustomerApplication클래스 안에서만 사용가능
    //static: static 메소드 안에서 사용 가능
    private static Scanner scanner = new Scanner(System.in);
    private static Customer[] customerArray = new Customer[50]; //Customer 객체만

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("----------------------------------------------");
            System.out.println
            ("1. 고객등록 | 2.고객 리스트 | 3.포인트사용 | 4.포인트적립 | 5. 종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택>");

            int selectNo = scanner.nextInt(); //입력받음

            switch (selectNo) {
               case 1: createCustomer(); break;
                case 2: CustomerList(); break;
                case 3: withdraw(); break;
                case 4: deposit(); break;
                case 5: run = false; break;
           }
        }

        System.out.println("프로그램 종료");
    }
    // 1. 고객 등록
    private static void createCustomer() {
        System.out.println("------------");
        System.out.println("고객 등록 ");
        System.out.println("------------");

        System.out.print("성함: ");
        String name = scanner.next();

        System.out.print("핸드폰번호: ");
        String number = scanner.next();

        System.out.print("집주소: ");
        String address = scanner.next();

        System.out.print("포인트 : ");
        int point = scanner.nextInt();

        //입력받은 정보를 이용해 Customer객체 생성
        Customer newCustomer = new Customer(name, number,address,point);

        //customerArray 배열에 Customer 객체를 저장하기
        for (int i = 0; i < customerArray.length; i++) {
            //customerArray의 디폴트 값은 null이 들어있다.
            //★고객을 순서대로 저장하기 위해 null체크
            if(customerArray[i] == null) {
                customerArray[i] = newCustomer;
                System.out.println("결과: 고객이 등록되었습니다.");
                //★쓸데없는 반복은 피한다, newCustomer객체를 배열에 전부 저장하지 않는다.
                break;
            }
        }
    }
    // 2. 고객 리스트

    private static void CustomerList() {
        System.out.println("------------");
        System.out.println("고객 리스트");
        System.out.println("------------");

        for (int i = 0; i < customerArray.length; i++) {
            Customer customer = customerArray[i];

            //★customerArray 배열 안에서 customer객체가 있는 부분만 가져온다.
            if (customer != null) {
                System.out.println
             (customer.getName() + " " + customer.getNumber() + " " + customer.getAddress() + " " + customer.getPoint());
            } else {
                break; //★쓸데없는 반복 피하기
            }
        }
    }
    // 3. 포인트 사용
    private static void withdraw() {
        System.out.println("------------");
        System.out.println("포인트 사용");
        System.out.println("------------");

        System.out.print("핸드폰번호 : ");
        String name = scanner.next();

        System.out.print("포인트: " );
        int money = scanner.nextInt();

        //입력받은 번호로 고객번호 객체 찾기
        Customer customer = findCustomer(name); //찾은 고객성함

        //해당 고객번호가 없으면 메소드를 종료시킴
        if(customer == null) {
            System.out.println("결과: 고객리스트에 없습니다.");
            return;
        }

        //'기존에 저장되어 있던 포인트 + 사용할 포인트'을 빼서 잔고에 추가해준다.
        if( customer.getPoint() >= 500 ){
            if( customer.getPoint() < money) {
                System.out.println(" 포인트가 부족합니다 ");
            } else {customer.setPoint(customer.getPoint() - money);
                System.out.println("결과: 포인트가 사용 완료되었습니다.");}
        } else {
            System.out.println("500점 이상부터 사용 가능합니다");
        }

    }
    // 4. 포인트 적립

    private static void deposit() {
        System.out.println("------------");
        System.out.println("포인트 적립");
        System.out.println("------------");

        System.out.print("핸드폰번호: ");
        String name = scanner.next();

        System.out.print("포인트: ");
        int money = scanner.nextInt();

        //입력받은 핸드폰번호로 고객번호 객체 찾기
        Customer customer = findCustomer(name); //찾은 고객번호

        //해당 고객번호가 없으면 메소드를 종료시킴
        if(customer == null) {
            System.out.println("결과: 해당 리스트가 없습니다.");
            return;
        }

        if (money >= 2000){
            money *= 1.1;
            System.out.println("결과: 10% 더 적립 완료되었습니다.");
            System.out.println(customer.getPoint());
        }
            customer.setPoint(customer.getPoint() + money);
            System.out.println("결과: 적립 완료되었습니다.");
            System.out.println(customer.getPoint());



    }


    // 5. 핸드폰번호로 고객 찾기

    private static Customer findCustomer(String name) {
        Customer customer = null; //return하기 위해 for문 바깥에 변수 선언

        //배열에 저장된 객체별 계좌번호를 하나씩 비교해 고객계좌를 찾는다.
        for (int i = 0; i < customerArray.length; i++) {
            //★customerArray 배열 안에서 Customer객체가 있는 부분만 가져온다.
            if (customerArray[i] != null) {
                //객체에 저장된 계좌번호 가져오기
                String dbName = customerArray[i].getName();

                //객체에 저장된 계좌번호와 매개변수의 계좌번호가 같으면 해당 객체를 customer 변수에 저장
                if(dbName.equals(name)) {
                    customer = customerArray[i];
                    break; //계좌번호를 찾으면 반복문을 빠져나온다
                }
            }
        }

        return customer; //찾은 계좌 객체를 리턴
    }
    // 6. 종료

}
