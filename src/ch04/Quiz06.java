package ch04;

public class Quiz06 {
    public static void main(String[] args) {
        /*
        두 개의 주사위를 던졌을 때,
        눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
        힌트: 이중 for문

            int num1 = (int) (Math.random() * 6) + 1;
            //1~6까지의 숫자를 랜덤하게 구해줍니다.
            int num2 = (int) (Math.random() * 6) + 1;
            //1~6까지의 숫자를 랜덤하게 구해줍니다.
         */


        for(int num1 = 1; num1 <=6; num1++  ){
            for (int num2 = 1; num2 <=6; num2++ ) {
                if( num1 + num2 == 6)
                    System.out.println(" num1: " + num1 + "  num2 : " + num2 );
            }
        }
    }
}
