package Chapter6;

public class CardTest {
    public static void main(String[] args) {
        // width와 height는 스태틱 변수여서 객체 생성 없이 사용가능
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c2: " + c2.kind + " c2.number: " + c2.number);
        System.out.println("c1: " + c1.kind + " c1.number: " + c1.number);

        System.out.println("width height을 50 80 변경");

        Card.width = 50;
        Card.height = 80;

        //c1.width = 50;
        //c1.height = 80;

        System.out.println("c2: " + c2.kind + " c2.number: " + c2.number);
        System.out.println("c1: " + c1.kind + " c1.number: " + c1.number);
    }
}


class Card {
    // 인스턴스 변수 (인스턴스 생성 될 때 만들어짐. 서로 다른 값 가능. 인스턴스별 서로 다른 속성일때)
    // 카드에서 종류와 숫자는 각각 다름
    String kind;
    int number;

    // static 변수 ( 클래스 변수). 모든 인스턴스들이 공유해야함
    // static 변수는 객체 생성 없이 사용 가능. '클래스명.변수명'
    // 카드의 높이와 폭은 다 일정함
    static int width = 100;
    static int height = 250;
}
