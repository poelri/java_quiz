package ch07;

public class Quiz07 {
    public static void main(String[] args) {
        /*
7. Parent 클래스를 상속받아 Child 클래스를 다음과 같이 작성했습니다. ChildExample 클래스
를 실행했을 때 호출되는 각 클래스의 생성자의 순서를 생각하면서 출력 결과를 작성해보세요.

public class Parent {
   public String nation;

   public Parent() {
      this(“대한민국”);
      System.out.println(“Parent() call”);
   }

   public Parent(String nation) {
      this.nation = nation;
      System.out.println(“Parent(String nation) call”);
   }
}
public class Child extends Parent{
  public String name;

  public Child() {
      this(“홍길동”);
      System.out.println(“Child() call”);
  }

  public Child(String name) {
      this.name = name;
      System.out.println(“Child(String name) call”);
  }
}
public class ChildExample {
   public static void main(String[] args) {
      Child child = new Child();
   }
}
this()는 같은 클래스의 다른 생성자를 호출할 때 사용한다.
Parent(String nation) call
Parent() call
Child(String name) call
Child() call
         */
    }
}
