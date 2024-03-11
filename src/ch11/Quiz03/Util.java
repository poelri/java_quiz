package ch11.Quiz03;
// 다음 Util 클래스의 정적 getValue() 메소드는 첫 번째 매개값으로 pair 객체를 받고,
// 두 번째 매개값으로 key를 받습니다.
// 리턴값은 key값이 일치할 경우 Pair에 저장된 값을 리턴하고,
// 일치하지 않으면 null을 리턴합니다.
// Util 클래스의 getValue() 제네릭 메소드 선언부를 작성해보세요.(물음표에 작성)
public class Util {
    public static <K,V>V getValue(Pair<K,V>pair,K key)
    {
        if(pair.getKey() == key) {
            return pair.getValue();
        } else {
            return null;
        }
    }
}
