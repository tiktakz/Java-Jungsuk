package Chapter6;

class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println(p1.serialNo);
        System.out.println(p2.serialNo);
        System.out.println(p3.serialNo);
    }
}

class Product {
    static int count = 10000;
    int serialNo;

    {
        // 인스턴스 초기화 블럭
        ++count;
        serialNo = count;
    }

    Product() {}
}
