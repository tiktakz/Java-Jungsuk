package Arraylist;

public interface ObjectCopy {
    public static void main(String[] args) {
        Book[] bookArray = new Book[3];
        Book[] bookArray1 = new Book[3];

        bookArray[0] = new Book("책1" , "아무개");
        bookArray[1] = new Book("책2" , "아무개");
        bookArray[2] = new Book("책3" , "아무개");

        bookArray1[0] = new Book();
        bookArray1[1] = new Book();
        bookArray1[2] = new Book();
        // arraycopy로 복사해보기
        //System.arraycopy(bookArray,0,bookArray1,0,3);

        for (int i=0; i<bookArray.length; i++) {
            bookArray1[i].setAuthor(bookArray[i].getAuthor());
            bookArray1[i].setBookName(bookArray[i].getBookName());
        }

        bookArray[0].setBookName("dd");
        bookArray[0].setAuthor("Gg");

        for (int i=0; i<bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        bookArray[0].setBookName("책이름변경한 책");
        bookArray[0].setAuthor("작가이름변경");


        for (int i=0; i<bookArray.length; i++) {
            bookArray[i].showBookInfo();
        }
        System.out.println("변경");
        for (int i=0; i<bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        //복사한 부분도 bookArray1에서도 같이 복사됨
        // 얕은 복사(주소가 복사 되었기 때문임)
        // 그러면 bookArray1도 새로운 객체 생성해주고 복사해주면됨.
    }
}
