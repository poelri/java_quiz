package ch03;

public class Quiz7 {
    public static void main(String[] args) {
        /*
         % 연산을 수행한 결과값에 10을 더하는 코드입니다.
         NaN 값을 검사해서 올바른 결과가 출력될 수 있도록
         ( )에 들어갈 코드를 작성

            double x = 5.0;
            double y = 0.0;
            double z = 5 % y;

            if ( ) {
                System.out.println("0.0으로 나눌 수 없습니다.");
            } else {
                double result = z + 10;
                System.out.println("결과: " + result);
            }

         */


        double x = 5.0;
        double y = 0.0;
        double z = 5 % y;

        if (Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z + 10;
            System.out.println("결과: " + result);
        }

    }
}
