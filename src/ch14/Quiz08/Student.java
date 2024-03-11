package ch14.Quiz08;

/*
HashSet에 Student 객체를 저장하려고 합니다. 학번이 같으면 동일한 Student라고 가정하고 중복 저장이 되지 않도록 하고 싶습니다.
Student 객체의 해시코드는 학번이라고 가정하고 Student 클래스를 작성해보세요.
 */

public class Student {
    public int studentNum;
    public String name;
    public Student (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return studentNum;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student student) {
            return studentNum == student.studentNum;
        } else {
            return false;
        }
    }
}
