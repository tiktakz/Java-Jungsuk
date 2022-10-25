package Inheritance;

public class VIPCustomer extends Customer {
    // VIP CUSTOMER
    private int agentID;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }
    
    public int getAgentID() {return agentID;}
}