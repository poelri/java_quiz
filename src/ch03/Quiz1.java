package ch03;

public class Quiz1 {
    public static void main(String[] args) {
       /*
       다음 코드를 실행했을 때 출력 결과를 예상하고 작성
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);
        x = 11
        먼저 들어간 Y = 20
        y = 19


        z = 31
        */


        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);


    }
}
