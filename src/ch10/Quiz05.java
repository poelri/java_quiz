package ch10;

public class Quiz05 {
    /*5. 다음 코드는 1부터 100까지의 숫자를 통 문자열로 만들기 위해 += 연산자를 이용해 100번 반
복하고 있습니다. 이것은 곧 100개 이상의 String 객체를 생성하는 결과를 만들기 때문에 좋은 코
드라고 볼 수 없습니다. StringBuilder를 사용해서 좀 더 효율적인 코드로 개선해보세요.

문자열 합산을 많이 하는경우 !! Builder 쓰는게조흠
     */
    public static void main(String[] args) {
        String str = "";
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i <= 100; i++) {
            str1.append(i);
        }
        str = str1.toString();
        System.out.println(str);

    }



}
