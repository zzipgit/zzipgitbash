package chapter08;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    /*public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.01;
        System.out.println("VIPCustomer() 생성자 호출 ");
    }*/

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        this.agentID = agentID;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호출 ");
    }

    public int getAgentID() {
        return agentID;
    }

    public String showVIPInfo () {
        return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다.";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}
