package ch04;

public class Quiz05 {
    public static void main(String[] args) {
        /*
        중첩 for 문을 이용하여 방정식 4x + 5y = 60의
        모든 해를 구해서 (x, y) 형태로 출력하는
        코드를 작성해보세요. 단, x와 y는 10 이하의 자연수입니다.

        public class Test {
            public static void main(String[] args) {
                for (int x = 1; x <= 10; x++){
                    for(int y = 1; y <= 10; y++) {
                     //4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드를 작성
                    }
                }
            }
        }
 Outter: for (char upper = 'A'; upper <='Z'; upper++){
            for(char lower = 'a'; lower<='z'; lower++){
                System.out.println(upper + "_" + lower);
                // 소문자가 g일때  프로그램끝내기
                if(lower == 'g') break Outter;

         */
        int sum = 0;
        for (int x = 1; x <= 10; x++){
            for(int y = 1; y <= 10; y++) {
                //4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드를 작성
                sum = (4*x) + (5*y);
                if(sum ==60){
                System.out.println("x : " + x + "," + "y : " + y);

                }

            }
        }
    }
}
