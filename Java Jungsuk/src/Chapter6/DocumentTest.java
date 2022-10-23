package Chapter6;

class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("동백꽃", "홍길동");
        Document d3 = new Document();
        Document d4 = new Document("Phasmophobia" , "Steam");
    }
}

class Document {
    static int count = 0;
    String title;
    String author;
    int page;
    static int no = 0;

    Document() {
        this("제목없음"+ ++count, "작자모름");
    }

    Document(String title, String author) {
        this.title = title;
        this.author = author;
        ++no;
        System.out.println("문서" + this.title + " 제작자 " + this.author + " 이 생성 되었습니다." + "**문서번호 :: " + no);
    }
}
