package ch03;

public class Quiz5 {
    public static void main(String[] args) {
        /*
        사다리꼴의 넓이를 구하는 코드입니다.
        정확히 소수 자릿수가 나올 수 있도록 ( )에
        들어갈 수 있는 코드를 모두 선택

        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = ( );
        System.out.println(area);
        (윗변의 길이 + 아랫변의 길이) * 높이 % 2
        (5 + 10 ) * 7 % 2

         (lengthTop+lengthBottom) * height / 2.0 52.5
         (lengthTop+lengthBottom) * height * 1.0 / 2 52.5
         (double)(lengthTop+lengthBottom) * height / 2 52.5
         (double)( (lengthTop+lengthBottom) * height / 2) 52.0

           ★ 부동 소수점 방식을 사용하는 실수 타입은 정확한 계산 X
              정확한 계산 결과를 얻고싶다면 정수로 연산 후 실수로 바꿔야합니다.
         */
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = ( (lengthTop+lengthBottom) * height * 1.0 / 2);
        System.out.println(area);
    }
}
