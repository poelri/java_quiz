package ch10;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz09 {
    /*
    9. SimpleDateFormat 클래스를 이용해서 오늘 날짜를 다음과 같이
    출력하도록 코드를 작성해 보세요.
XXXX년 XX월 XX일 X요일 XX시 XX분
     */
    public static void main(String[] args) {
        Date now = new Date(); // 오늘의 날짜와 시간.
        SimpleDateFormat TimeAndDate = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 MM분");
        System.out.println(TimeAndDate.format(now));


    }
}
