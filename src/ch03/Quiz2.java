package ch03;

public class Quiz2 {
    public static void main(String[] args) {
        /*
        다음 코드를 실행했을 때 출력 결과를 예상하고 작성
        int score = 85;
        String result = (!(score>90))? "가":"나";
        System.out.println(result);

        !(85 > 90)
        85점이 90점 보다 크니? ㄴㄴ false
        그걸 부정한게 true
        true 니까 가 를 출력
        정답 : 가
         */

        int score = 85;
        String result = (!(score>90))? "가":"나";
        System.out.println(result);

    }
}
