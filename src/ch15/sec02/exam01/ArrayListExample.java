package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList 정의 방법

        // E에 지정된 타입 객체만 저장
        List<Board> list = new ArrayList<Board>();
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));

        Board board = list.get(2);
        System.out.println(board.getSubject() + " " + board.getWriter());

        list.remove(1);

        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            Board board2 = list.get(i);
            System.out.println(board2.getSubject() + " " + board2.getWriter());
        }

        System.out.println();
        for (Board board3 : list) {
            System.out.println(board3.getSubject() + " " + board3.getWriter());
        }

        List<Board> list2 = new ArrayList<>();
        list2.add(new Board("제목1", "내용1", "글쓴이1"));
        //list2.add("문자열 객체");

        // 모든 타입의 객체 저장
        // 제네릭을 지정하지 않으면 디폴트 타입은 Object
        List list3 = new ArrayList();
        list3.add(new Board("제목1", "내용1", "글쓴이1"));
        list3.add("문자열 객체");

        ArrayList list4 = new ArrayList();
        list4.add(new Board("제목1", "내용1", "글쓴이1"));
        list4.add("문자열 객체");

    }
}
