package Inheritance;

public class VIPCustomer extends Customer {
    // VIP CUSTOMER
    private int agentID;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }
    
    public int getAgentID() {return agentID;}

    public int calcPrice(int price) {
        // Override method
        bonusPoint += price * bonusRatio;
        return price - (int)(price*saleRatio);
    }
}