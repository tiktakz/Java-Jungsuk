class CarTest {
    // P.294 생성자 연습
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "manual";
        c1.door = 2;

        Car c2 = new Car("black", "auto", 3);

        // c1 보다 c2 생성하는것이 더 간결함
        System.out.println("c1 특징 " + ", " + c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println("c2 특징 " + ", " + c2.color + ", " + c2.gearType + ", " + c2.door);
    }
}

class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1); // c1 생성한 것을 복사해서 c2 만든다
        System.out.println("c1 특징 " + ", " + c1.color + ", " + c1.gearType + ", " + c1.door); 
        System.out.println("c2 특징 " + ", " + c2.color + ", " + c2.gearType + ", " + c2.door);
        
        c1.door = 100;
        System.out.println("c1.door 100 수행이후");
        System.out.println("c1 특징 " + ", " + c1.color + ", " + c1.gearType + ", " + c1.door); 
        System.out.println("c2 특징 " + ", " + c2.color + ", " + c2.gearType + ", " + c2.door);

        // 복사만 되고 서로 다른 메모리 공간에 저장이 된다
    }
}

class Car {
    String color;
    String gearType;
    int door;

    // 매개변수 없는 생성자
    // 매개변수 없이 생성하면 기본으로 white, auto, 4로 생성
    Car() {
        this("white", "auto", 4);
    }
    // 매개변수로 인스턴스를 받음 -> 복사가능
    Car(Car c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    // 인스턴스 복사 코드를 조금 더 간결하게
    /*
    Car(Car c) {
        this(c.color, c.gearType, c.door);
    }
    */


    Car(String color, String gearType, int door) {
        // 매개변수와 인스턴스 변수의 이름이 같기 때문에 구별하기 위해 this. 를 사용한다
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class BlockTest {
    // P.303 초기화
    // class 초기화 블럭
    static {
        System.out.println("static { }"); // 클래스 초기화는 메모리 할당되고 한번만 실행
    }

    {
        System.out.println("{ }"); // 인스턴스 초기화 블럭
    }

    public BlockTest() {
        // 생성자
        System.out.println("생성자");
    }
    
    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest(); ");
        BlockTest bt2 = new BlockTest();
    }
}

class Product {
    // P. 306
    static int count = 0; //클래스 변수 -> 생성된 인스턴수 수 관리
    int serialNo; // 인스턴스 변수 -> 제품 고유 번호

    {
        // 인스턴스 블럭;
        // 인스턴스가 생성될 때마다 count 값을 증가시키고 serialNo에 저장
        ++count;
        serialNo = count;
    }

    public Product() {} // 생성자 
}

class ProductTest { 
    public static void main(String[] args) {
        // 3개의 product 생성
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호는 " + p1.serialNo);
        System.out.println("p2의 제품번호는 " + p2.serialNo);
        System.out.println("p3의 제품번호는 " + p3.serialNo);
        System.out.println("총 생산된 제품은 " + Product.count);
    }
}

class Document {
    static int count = 0;
    String name;

    // 문서명 없이 생성했을 때
    Document () {
        this("제목없음" + ++count);
    }

    // 문서 이름 있을 때
    Document(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었다");
    }
}

class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("기모찡");
        Document d3 = new Document();
        Document d4 = new Document("이건 뭘까");
        Document d5 = new Document();
    }
}