package ch05;

public class Quiz08 {
    public static void main(String[] args) {
        /*
        주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요(힌트: for 문 이용)
             int[] array = { 1, 5, 3, 8, 2 };
         */

        int[] array = { 1, 5, 3, 8, 2 };
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if(max < array[i] ) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
