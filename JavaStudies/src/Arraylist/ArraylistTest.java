package Arraylist;
import java.util.ArrayList;

public class ArraylistTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for (String s : list) {
            System.out.println(s);
        }

        // Arraylist는 인덱스 사용할 수 없음. get 메소드 사용

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
