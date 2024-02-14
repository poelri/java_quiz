package ch04;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
/*
        // 자동차 속도 출력 하는 기능
        // 세가지의 기능 존재 1. 증속 , 2. 감속, 3. 중지 => 스캐너를 이용해 입력 받음

        Scanner scanner = new Scanner(System.in);
        boolean run = true; // 현재 자동차가 달리는 중인지  상태값
        int speed = 0 ; // 현재 속도

        //무한반복
        while (run) {
            //메뉴생성
            System.out.println("------------------------");
            System.out.println("1.증속 | 2.감속 | 3. 중지");
            System.out.println("------------------------");

            // 스캐너로 값을 입력받음
            System.out.print("선택 : ");
            String strNum = scanner.nextLine() ;// 입력 받은 값을 저장

            if(strNum.equals("1")) { // String 타입은 값을 비교할때 equals를 사용
                //1. 증속 : speed를 올림
                speed++;
                System.out.println("현재속도 = " + speed);
            }  else if(strNum.equals("2")){
            // 2. 감속 : speed를 내림
                speed --;
                System.out.println("현재속도 = " + speed);
            } else {
            // 3. 중지 : 프로그램 종료
                run = false;
            }

        }
        System.out.println("프로그램 종료");
 */
        Scanner scanner = new Scanner(System.in);
        boolean money = true;
        int addmoney = 10000; // 현재 돈
        int minusmoney = 0;

        while (money) {

            System.out.println("---------------------");
            System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("---------------------");

            System.out.print("선택 : ");
            String strNum = scanner.nextLine();// 입력 받은 값을 저장

            if (strNum.equals("1")) { // String 타입은 값을 비교할때 equals를 사용
                //1. 증속 : speed를 올림

                System.out.println("예금액 = " + addmoney);

            } else if (strNum.equals("2")) {
                // 2. 감속 : speed를 내림
                minusmoney  = 2 * 1000;
                System.out.println("출금액 = " + minusmoney );

            }  else if (strNum.equals("3")) {
                addmoney = addmoney - minusmoney;
                System.out.println("잔고 = " + addmoney);

            } else {
                // 3. 중지 : 프로그램 종료
                money = false;
                System.out.println("프로그램 종료");

            }
        }
    }
}
