package ch10;

public class Quiz07 {
    /*
    7. 숫자 100과 300으로 각각 박싱된 Integer 객체를 == 연산자로 비교한 결과 100을 박싱한
Integer 객체는 true가 나오지만, 300을 박싱한 Integer 객체는 false가 나왔습니다. 그 이유를 설
명하고, 값만 비교할 수 있도록 코드를 수정해보세요.

     */
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2);
        System.out.println(obj3.equals(obj4));

        /*
        포장객체는 프린트 타입처럼 값을 가지고 있는게 아니라 주소를 가지고 있음 ! !

        자바는 -128 ~127 까지의 값에 대해 integer 객체를 동일 한 값을 가리키는 객체로 재사용함
        그래서 obj1과 obj2는 같은 객체를 참조하므로 true 이지만
        obj3과 4는 127의 범위를 벗어나기 때문에 false 이다.

        3,4과 같은 값인지를 비교하기 위해서는 == 연산자가 아닌 equals 메소드를 사용해야함
         */
    }

}
