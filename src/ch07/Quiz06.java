package ch07;

public class Quiz06 {
    public static void main(String[] args) {
        /*

. Parent 클래스를 상속해서 Child 클래스를 다음과 같이 작성했는데, Child 생성자에서 컴파일
에러가 발생했습니다. 그 이유와 해결 방법을 설명해보세요.

public class Parent {
   public String name;

   public Parent(String name) {
        this.name = name;
   }
}
public class Child extends Parent {
   public int studentNo;

   public Child(String name, int studentNo) {
       this.name = name;
       this.studentNo = studentNo;
   }
}

 부모클래스의 생성자에 매개변수가 있는 경우는 super()를 생략 할수 없다.
 String name 이라는 매개 변수가 있기 때문에 자식태그에는 super()를 적어야함
 this.name = name; 을 지우고 super(name) 으로 작성해야함
         */
    }
}
