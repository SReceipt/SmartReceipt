/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartReceipt;
/**
 *
 * @author DELL
 */
import java.util.Date;


public class Payment {
    
    private double total;
    private Date date;
    private double vat;

    public Payment(double total, Date date, double vat) {
        this.total = total;
        this.date = date;
        this.vat = vat;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public Date getDate() {
        return date;
    }

    public double getVat() {
        return vat;
    }
    
    @Override
    public String toString() {
        return "Payment{ " + "total = " + total + ", date = " + date + ", vat = " + vat + '}';
    }
    
}
