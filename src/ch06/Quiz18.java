package ch06;

public class Quiz18 {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;
    // static int cv2 = iv; // 첫번째 컴파일 에러
    // static메소드 안에 넣을수없음


    static void staticMethod1() {
        System.out.println(cv);
    //    System.out.println(iv); // 두번째 컴파일 에러
    }


    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }


    static void staticMethod2() {
        staticMethod1();
     //   instanceMethod1();   // 세번째 컴파일 에러
        // static 메소드 안에 호출할수없다. 객체를 생성하고 난 후에 호출가능
    }


    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }

}
