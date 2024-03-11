package ch10;

public class Quiz06 {
    /*
    6. 다음 문자열에서 쉼표(,)로 구분되어 있는 문자열을
    StringTokenizer를 이용해서 분리시키고 출력해보세요.
아이디, 이름, 패스워드


     */


    public static void main(String[] args) {
        String str = "아이디,이름,패스워드";
        String[] arr = str.split(",");
        for(String result : arr){
            System.out.println(result);
        }


    }
}
