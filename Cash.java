/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartReceipt;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Cash extends Payment{
    
    private double change;
    private double amountPaid;
    
    public Cash(double change, double amountPaid, double total, Date date, double vat) {
        super(total, date, vat);
        this.change = change;
        this.amountPaid = amountPaid;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getAmountPayed() {
        return amountPaid;
    }

    public void setAmountPayed(double amountPayed) {
        this.amountPaid = amountPayed;
    }
}
