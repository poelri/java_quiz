package ch09;

public class Quiz05 {
    /*
    5. 메소드가 다음과 같이 선언되어 있습니다. 잘못된 예외 처리를 선택하세요. 3

public void method1() throws NumberFormatException, ClassNotFoundException{ … }

➊ try { method1( ); } catch (Exception e) { }
➋ void method2( ) throws Exception { method1( ); }
➌ try { method1( ); }
   catch (Exception e) { }
   catch (ClassNotFoundException e) { }
➍ try { method1( ); }
   catch (ClassNotFoundException e) { }
   catch (NumberFormatException e) { }

   try{ method1(); } catch (Exception e) { } catch (ClassNotFoundException e) { }
   하위 예외 클래스를 먼저 작성하고 상위클래스 예외 작성
   > 왜냐하면 하위 예외는 상위 예외를 상속했기 때문에 상위 예외 타입도 되기 때문에
   하위 예외 클래스를 나중에 작성할 시 먼저 상위 예외 클래스가 실행되어
   하위 예외 클래스는 실행되지 않기 때문이다.

     */
}
