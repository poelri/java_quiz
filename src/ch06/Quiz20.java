package ch06;

public class Quiz20 {
    static boolean isNumber(String str){
        if(str == null || str.equals("")) return false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // 자동타입 변환이 일어나면서 유니코드로 비교한다.
            // 유니코드는 0~9 사이의 숫자만 존재한다
            if(ch <'0' || ch >'9') return false;

        }
        return true; // for문을 무사히 빠져나왔다는 건 str 값이 모두 숫자라는 의미
    }

    public static void main(String[] args) {
        /*
        . 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
        -메서드명 : isNumber
        -기능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
        모두 숫자로만 이루어져 있으면 true를 반환하고, 그렇지 않으면 false를 반환한다.
        만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다.
        -반환타입 : boolean
        -매개변수 : String str ->검사할 문자열

class Example {
	//isNumber() 메소드 작성
   	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
}
         */
        // 모든 문자열이 숫자로만 이루어져 있는지 확인하는 메소드


        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

    }
}
