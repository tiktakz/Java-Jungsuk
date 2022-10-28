package Chapter7;

class FinalCardTest {
    public static void main(String[] args) {
        FinalCard card = new FinalCard("Heart", 10);
        // card.NUMBER = 5; --> 상수이기에 변경할 수 없음
        System.out.println(card.KIND);
        System.out.println(card.NUMBER);
        System.out.println(card.toString());

    }    
}

class FinalCard {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    FinalCard(String kind, int num) {
        // KIND 와 NUMBER은 상수이지만 생성자를 통해서 초기화를 하면
        // 각 인스턴스마다 변경되지 않는 숫자와 종류를 설정할 수 있음
        KIND = kind;
        NUMBER = num;
    }

    FinalCard() {
        this("Heart", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}