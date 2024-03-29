package OOP;

import OOP.Customer;

public class CustomerManager {
    private Customer customer;
    private ICreditManager iCreditManager;
    public CustomerManager(Customer customer, ICreditManager iCreditManager){
        this.customer = customer;
        this.iCreditManager = iCreditManager;

    }

    public void save(){
        System.out.println("Customer saved.");
    }
    public void delete(){
        System.out.println("Customer deleted.");
    }
    public void giveCredit(){
        iCreditManager.calculate();
        System.out.println("Credit accepted.");

    }
}