package SmartReceipt;

import java.util.ArrayList;


public class Shop {
    
    private String name;
    private String location;
    private int branchID;
    ArrayList<Receipt> receipts;
    private double vatPercent;
    
    public Shop(String name, String location, int branchID, double vatPercent) {
        this.name = name;
        this.location = location;
        this.branchID = branchID;
        receipts = new ArrayList<>();
        this.vatPercent = vatPercent;
    }
    
    public void newReceipt(ArrayList<Item> items, String paymentType, String customerID) {
        receipts.add(new Receipt(this, Receipt.generateReceiptID(), items, paymentType, customerID));
    }
    
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return branchID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setId(int branchID) {
        this.branchID = branchID;
    }

    public int getBranchID() {
        return branchID;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public ArrayList<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(ArrayList<Receipt> receipts) {
        this.receipts = receipts;
    }

    public double getVatPercent() {
        return vatPercent;
    }

    public void setVatPercent(double vatPercent) {
        this.vatPercent = vatPercent;
    }
    
    

    @Override
    public String toString() {
        return "Shop{" + "Name: " + name + ", Location: " + location + ", Branch ID: " + branchID + '}';
    }
    
}
