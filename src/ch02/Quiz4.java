package ch02;

public class Quiz4 {
    public static void main(String[] args) {
        /*
        자동 타입 변환에서 컴파일 에러가 발생하는 것을 선택하고 그 이유
        byte byteValue = 10;
        char charValue = ‘A’;


        int intValue1 = byteValue;
        int intValue2 = charValue;
        short shortValue = charValue;
        double doubleValue = byteValue;
        -> 작은 것에서 큰것으로는 자동타입변환이 자동으로 된다.
        byte < short = char < int < long < float < double
        정수 보다는 실수가 더 ~큼

    3 :   char 와 short 는 크기는 같지만 범위 사용이 다르다.
          char 은 0~216-1 , short -215~215-1
          서로 범위가 달라서 둘 중 어느 쪽으로의 형변환도 값 손실이
          발생할 수 있으므로 자동적으로 형변환이 수행될 수 없다
          음수부호 문제도 존재: char 의 범위는 양수만 갖는
          0~65535 이므로 음수가 올 수 없다

          서로 가용범위가 달라서 자료손실이 일어날 수 있다.
          특히 short 는 최상위 부호비트를 음수를 표현하는데 사용함.

         */
    }
}
