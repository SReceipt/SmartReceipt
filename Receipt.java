package SmartReceipt;


import java.util.ArrayList;
import java.util.Date;


public class Receipt {
    private static int globalReceiptID = 0;
    private Shop shop;
    private int receiptID;
    private ArrayList<Item> items;
    private double total;
    private double vat;
    private Date date;
    private String paymentType;
    // Customer wallet public key
    private String customerID;

    public Receipt(Shop shop, int receiptID, ArrayList<Item> items, String paymentType, String customerID) {
        this.shop = shop;
        this.receiptID = receiptID;
        this.items = items;
        this.paymentType = paymentType;
        this.customerID = customerID;
        this.date = new Date();
        
        total = 0;
        for(Item i: items) {
            total += i.getPrice() * i.getQuantity();
        }
        
        vat = total * shop.getVatPercent();
    }
    
    public static int generateReceiptID() {
        return ++globalReceiptID;
    }
    
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public int getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(int receiptID) {
        this.receiptID = receiptID;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Receipt{\n" + "Receipt ID: " + receiptID + "\nShop: " + shop 
                + "\nItems: " + items + "\nTotal: " + total + "\nVat: " + vat 
                + "\nDate: " + date + "\nPayment Type: " + paymentType 
                + "\nCustomer ID: " + customerID + "\n}";
    }
    
    
}
