package ch10.Quiz03;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "[실행결과]" + "\n"+ name ;
    }

}


