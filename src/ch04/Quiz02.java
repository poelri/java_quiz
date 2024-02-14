package ch04;

public class Quiz02 {
    public static void main(String[] args) {
        /*

        int sum = 0;
          for(int i=1; i<10; i++) {
           ?
          }
         System.out.println("3의 배수의 합: " + sum);

        힌트: 3의 배수는 3으로 나눴을때 나머지가 0

         */

        int sum = 0;
        for(int i=1; i<100; i++) {
            if ( i % 3 == 0 )
                sum += i ;

        }
        System.out.println("3의 배수의 합: " + sum);
    }
}
