package ch03;

public class Quiz3 {
    public static void main(String[] args) {
        /*
        534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때
         1인당 몇 개를 가질 수 있고,
        마지막에 몇 개가 남는지를 구하는 코드

        int pencils = 534;
        int students = 30;
        int pencilsPerStudent = ( 534 / 30    ); //학생 한 명이 가지는 연필 수
        System.out.println(pencilsPerStudent);

        int pencilsLeft = ( 534 % 30  );//남은 연필 수
        System.out.println(pencilsLeft);

         */

        int pencils = 534;
        int students = 30;
        int pencilsPerStudent = ( 534 / 30 ); //학생 한 명이 가지는 연필 수
        System.out.println(pencilsPerStudent);

        int pencilsLeft = ( 534 % 30  );//남은 연필 수
        System.out.println(pencilsLeft);
    }
}
