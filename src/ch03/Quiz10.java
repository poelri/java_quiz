package ch03;

public class Quiz10 {
    public static void main(String[] args) {
        /*
        변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다.
        만일 변수 num의 값이 333이라면 331이 되고,
        777이라면 771이 된다. ( )에 알맞은 코드

        class Exercise {
        public static void main(String[] args) {
         int num = 333;
         System.out.println( );
    }
}
         */
        int num = 333;
        System.out.println(num/10*10 + 1 );


    }
}
