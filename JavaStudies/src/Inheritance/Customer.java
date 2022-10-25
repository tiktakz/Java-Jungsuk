package Inheritance;

public class Customer {
    // 일반 고객
    // protected는 상속관계에서 볼 수 있고 외부 클래스에서는 사용할 수 없음. 같은 패키지에서도 가능
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    /*public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }
    */
    
    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " +
        bonusPoint + "입니다";
    }

    public int getCustomerID() {return customerID;}
    public void setCustomerID(int customerID) {this.customerID = customerID;}
    public String getCustomerName() {return customerName;}
    public void setCustomerName(String customerName) {this.customerName = customerName;}
    public String getCustomerGrade() {return customerGrade;}
    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}