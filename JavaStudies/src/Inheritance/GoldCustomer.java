package Inheritance;

public class GoldCustomer extends Customer {

    public GoldCustomer() {
        bonusRatio = 0.05;
    }

    public int calcPrice(int price) {
        return super.calcPrice(price);
    }

    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
