package ch14.Quiz07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public List<Board> getBoardList() {
        // board 객체를담은 List 컬렉션 리턴
        // 리턴을 하기전에 board 객체에 데이터를 담는다.
        List<Board> list = new ArrayList<Board>();
        list.add(new Board("제목1", "내용1"));
        list.add(new Board("제목2", "내용2"));
        list.add(new Board("제목3", "내용3"));
        return list;
    }

}
