package ch05;

public class Quiz07 {
    public static void main(String[] args) {
        /*
        다음 배열에 담긴 값을 모두 더하는 프로그램을 만드시오(힌트: for 문 이용)
              int[] arr = {10, 20, 30, 40, 50};
         */
        int sum = 0 ;
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}
