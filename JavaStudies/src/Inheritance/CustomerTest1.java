package Inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10100,"LEE");

        Customer customerKim = new VIPCustomer(10101,"Kim");
        // 하위 클래스 생성시 상위클래스가 먼저 호출됨.
        customerKim.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());
    }
}
