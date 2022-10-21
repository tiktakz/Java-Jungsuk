package Arraylist;

public class BookArray {

    public static void main(String[] args) {
        // 객체배열 생성하기
        Book[] library = new Book[5];
        // 객체배열은 생성하면 할당해줘야함
        library[0] = new Book("한국사1" , "아무개");
        library[1] = new Book("한국사2" , "아무개");
        library[2] = new Book("한국사3" , "아무개");
        library[3] = new Book("한국사4" , "아무개");
        library[4] = new Book("한국사5" , "아무개");

        for (int i=0; i<library.length; i++) {
            System.out.println(library[i]);
        }

        for (int i=0; i<library.length; i++) {
            library[i].showBookInfo();
        }
    }
}
