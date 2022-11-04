package Chapter9;

class CardToString {
    public static void main(String[] args) {
        CardTest c1 = new CardTest();
        CardTest c2 = new CardTest();

        // .toString()을 오버라이딩 하지 않고 사용하면 16진수 해시코드를 얻는다
        // 결과 : CardTest@6b95977 CardTest@7e9e5f8a
        // System.out.println(c1.toString());
        // System.out.println(c2.toString());

        // 오버라이딩 해서 사용하여 카드의 내용 보여주기
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    } 
}

class CardTest {
    String kind;
    int num;

    CardTest() {
        this("SPADE",1);
    }

    CardTest(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return "kind: " + this.kind + " num: " + this.num;
    }
}
