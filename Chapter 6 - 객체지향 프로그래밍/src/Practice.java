class Tv {
    // TV 클래스 생성
    // Tv의 멤버변수 선언
    String color;
    boolean power;
    int channel;

    // TV Methods
    void power() { power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class TvTest {
    public static void main(String[] args) {
        Tv t1 = new Tv(); // TV Instance t1
        Tv t2 = new Tv(); // TV Instance t2

        System.out.println("t1의 channel 값은 " + t1.channel + " 입니다");
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다");

        t1.channel = 7;
        System.out.println("변경된 t1의 channel 값은 " + t1.channel + " 입니다");
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다");

    }
}

class TvTest2 {
    // P.238
    public static void main(String[] args) {
        Tv t1 = new Tv(); // TV Instance t1
        Tv t2 = new Tv(); // TV Instance t2

        System.out.println("t1의 channel 값은 " + t1.channel + " 입니다");
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다");
        // t1의 주소를 t2로 넣으면 t2가 가르키는 인스턴스 주소는 없어짐
        // 하나의 참조변수는 여러개의 인스턴스 변수를 가리킬 수 없음
        // 하지만 여러개의 참조변수는 하나의 인스턴스 변수를 참조할 수 있음
        t2 = t1;
        t1.channel = 7;
        System.out.println("변경된 t1의 channel 값은 " + t1.channel + " 입니다");
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다");
    }
}

class TvTest3 {
    // 객체배열 
    public static void main(String[] args) {
        Tv [] tvArr = new Tv[3]; // 길이가 3인 Tv 객체 배열 생성, 실제 객체는 없음. 주소만 저장

        // 주소만 저장되어있기 때문에 실제 객체를 배열안에 생성해줌
        for (int i=0; i<tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;
        }

        for (int i=0; i<tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.println(tvArr[i].channel);
        }

    }
}

class Card{
    // kind와 number은 카드마다 다르기 때문에 인스턴스 변수
    String kind;
    int number;
    // 높이와 넓이는 카드 모두 공통이기에 클래스 변수로 선언. static 붙이면 된다
    static int width = 100;
    static int height = 250;
}

class cardTest {
    // P.248
    // static변수, 인스턴스 변수, 지역변수
    public static void main(String[] args) {
        System.out.println("Card Width = " + Card.width); // width와 height는 클래스 변수임. 인스턴스 생성 없이도 사용 가능
        System.out.println("Card Height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1 은 " + c1.kind + ", " + c1.number + "크기는 " + c1.width + "," + c1.height);
        System.out.println("c2 은 " + c2.kind + ", " + c2.number + "크기는 " + c2.width + "," + c2.height);
        System.out.println("c1의 width와 height를 50, 80으로 변경한다");

        c1.width = 50;
        c1.height = 80;

        System.out.println("c1 은 " + c1.kind + ", " + c1.number + "크기는 " + c1.width + "," + c1.height);
        System.out.println("c2 은 " + c2.kind + ", " + c2.number + "크기는 " + c2.width + "," + c2.height);

        // 실행결과 c2의 height와 width 또한 50,80으로 변한다.
        // width와 height는 클래스 변수(공통적으로 공유)이기 때문에 둘다 바뀐다

    }
}