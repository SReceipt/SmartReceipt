/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartReceipt;
/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.Date;

public class Receipt {

    private int receiptID;
    private Shop shop;
    private Customer customer;
    private ArrayList<Item> items;
    private Payment payment;

    public Receipt(int receiptID, Shop shop, Customer customer, ArrayList<Item> items, Payment payment) {
        this.receiptID = receiptID;
        this.shop = shop;
        this.customer = customer;
        this.items = items;
        this.payment = payment;
    }
    
    
    /**
     * @return the receiptID
     */
    public int getReceiptID() {
        return receiptID;
    }

    /**
     * @param receiptID the receiptID to set
     */
    public void setReceiptID(int receiptID) {
        this.receiptID = receiptID;
    }

    /**
     * @return the shop
     */
    public Shop getShop() {
        return shop;
    }

    /**
     * @param shop the shop to set
     */
    public void setShop(Shop shop) {
        this.shop = shop;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the items
     */
    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    /**
     * @return the payment
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    
    
}
