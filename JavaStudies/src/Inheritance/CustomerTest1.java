package Inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10100,"LEE");
        Customer customerKim = new VIPCustomer(10101,"Kim", 50000);
        // 하위 클래스 생성시 상위클래스가 먼저 호출됨.
        customerKim.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());

        // 오버라이딩 테스트
        System.out.println("--------");
        Customer customer1 = new Customer(30000, "Test Lee");
        customer1.calcPrice(10000);
        System.out.println(customer1.showCustomerInfo());

        // VIPCustomer calcPrice() overide
        VIPCustomer customer2 = new VIPCustomer(40000, "Test Kim",100);
        customer2.calcPrice(10000);
        System.out.println(customer2.showCustomerInfo());        

        Customer customerWho = new VIPCustomer(100010, "WHO", 200);
        int price = customerWho.calcPrice(10000);
        System.out.println(customerWho.showCustomerInfo());
        //500
        // Customer타입 이지만 VIPCustomer으로 생성되며, 그 클래스의 메소드가 호출됨

        Customer customerGold = new GoldCustomer();
        
    }
}
