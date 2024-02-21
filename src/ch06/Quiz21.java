package ch06;

public class Quiz21 {
    static int max(int[] arr) {
        if(arr == null || arr.length == 0 ) {
            return -999999;
        }
        int max = arr[0] ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max ) max = arr[i];

        }
        return max;

    }
    public static void main(String[] args) {
        /*
         다음과 같이 정의된 메소드를 작성하고 테스트 하시오.

            -메서드명 : max
            -기능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다. 만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
            -반환타입 : int
            -매개변수 : int[] arr -> 최대값을 구할 배열
            class Example {
                //max 메소드 작성
                public static void main(String[] args) {
                    int[] data = { 3, 2, 9, 4, 7 };
                    System.out.println(java.util.Arrays.toString(data));
                    System.out.println("최대값:" + max(data));
                    System.out.println("최대값:" + max(null));

                       // 크기가 0인 배열
                    System.out.println("최대값:" + max(new int[] {}));
                 }
            }
            *힌트: 배열의 첫번째 값을 최대값으로 지정하고 다른 값들과 하나씩 비교한다.
             */

        int[] data = { 3, 2, 9, 4, 7 };
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));

        // 크기가 0인 배열
        System.out.println("최대값:" + max(new int[] {}));
    }
}
