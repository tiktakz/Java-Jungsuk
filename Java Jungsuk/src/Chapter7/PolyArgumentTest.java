package Chapter7;


class Product {
    // 제품 모든 공통 속성
    int price;
    int bonusPoint;

    Product() {}

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv1 extends Product {
    Tv1() {
        super(100); // 조상클래스 생성자 호출해서 가격을 100원으로 설정
    }
    public String toString() {
        return "Tv1";
    }
}

class Computer1 extends Product {
    Computer1() {
        super(300);
    }
    public String toString() {
        return "Computer1";
    }
}

class Audio1 extends Product {
    Audio1() { super(50);}
    public String toString() { return "Audio1"; }
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10]; // Product타입 10크기의 배열을 생성. 처음은 다 Null
    int i=0;
    // 매개변수로 Product를 안받으면 Tv, Computer ... 물건 생성될 때마다
    // buy method를 새로 만들어줘야함
    void buy (Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p; // 0번째부터 p를 저장하고 i증가
        System.out.println(p.toString() + "을 구입");
    }

    void summary() { // 구입 물품 요약 
        int sum=0;
        String itemList = "";

        for (int i=0; i<item.length; i++) {
            if (item[i] == null) {
                break;
            }
            sum += item[i].price;
            itemList += item[i] + " , ";
        }

        System.out.println("구입한 물건의 총 금액은 " + sum + "만원");
        System.out.println("구입한 물건은 " + itemList + "입니다");
    }
}

class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv1()); // Tv t = new Tv(); b.buy(t)와 같음
        b.buy(new Computer1());
        b.buy(new Audio1());

        System.out.println("현재 남은 돈 " + b.money + "만원입니다");
        System.out.println("보너스 점수는 " + b.bonusPoint + "입니다");

        b.summary();
    }   
}