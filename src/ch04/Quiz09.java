package ch04;

import java.util.Scanner;

public class Quiz09 {
    public static void main(String[] args) {
        /*
           // scanner를 이용해 q를 입력받으면 프로그램 종료를 시킴

        System.out.println("메세지를 입력하세요");
        System.out.println("프로그램 종료하려면 q를 입력하세요");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.print("입력 : ");
            inputString = scanner.nextLine(); // 값 입력받음
            System.out.println(inputString);//입력 받은 값 출력

        } while (!inputString.equals("q")); // inputString이 "q"가 아니라면 이라는 조건식

        System.out.println(" 프로그램 종료 ");
         */

//1과 100사이의 임의 값을 얻어서 answer에 저장한다.
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;  //사용자 입력을 저장할 공간
        int count = 0;  //시도 횟수를 세기위한 변수


        //화면 입력을 받기 위해 Scanner 클래스 사용
        Scanner s = new Scanner(System.in);


        do {
            count++;
            System.out.println("1과 100사이의 값을 입력하세요");
            input = s.nextInt(); //입력받은 값을 변수에 저장한다.

            if ( input > answer) {
                System.out.println("입력받은 값이 더 큽니다");
            } else if ( input < answer) {
                System.out.println("입력받은 값이 더 작습니다");
            } else  {
                System.out.println( " 시도 횟수 :" + count + ", 프로그램종료");
                break;
            }

        }while (true);

    }
}
