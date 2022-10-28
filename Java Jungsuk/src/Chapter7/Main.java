package Chapter7;

class Main {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv()); // Tv t = new Tv(); b.buy(t)와 같음
        b.buy(new Computer());

        System.out.println("현재 남은 돈 " + b.money + "만원입니다");
        System.out.println("보너스 점수는 " + b.bonusPoint + "입니다");
    }   
}

class Product {
    // 제품 모든 공통 속성
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product {
    Tv() {
        super(100); // 조상클래스 생성자 호출해서 가격을 100원으로 설정
    }
}

class Computer extends Product {
    Computer() {
        super(300);
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    // 매개변수로 Product를 안받으면 Tv, Computer ... 물건 생성될 때마다
    // buy method를 새로 만들어줘야함
    void buy (Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을 구입");
    }
}

