package ch02;

public class Quiz11 {
    public static void main(String[] args) {
        /*
        형변환을 생략할 수 있는 것을 고르고 생략할 수 없는 이유를 작성하세요. (답:4)

        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;


         b = (byte)i; // 허용범위 int >  byte → 이므로 반드시 형변환 필요
         ch = (char)b; // 허용범위 byte < char → 이지만 byte의 음수부호로 인해 형변환 필요(예외상황)
             상세풀이: char 는 2byte이지만 char의 범위는 양수만 갖는 0~65535 이므로 음수가 올 수 없다.
              따라서 음수가 올수 있는 byte는 char 로 자동 변환할 수 없다.
         short s = (short)ch; // 허용범위 char = short   →
         이지만 short는 char과 값의 범위가 다르고 음수부호도 존재하므로  형변환 필요(예외상황)
         i = (int)ch;  // 허용범위 char < int → 이므로 생략가능


            정답 4번 .

         */
    }
}
