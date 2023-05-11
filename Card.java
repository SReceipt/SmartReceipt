/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartReceipt;

import java.util.Date;

public class Card extends Payment{
    
    private int cvv;
    private String cardNumber;
    private String expiryDate;

    public Card(int cvv, String cardNumber, String expiryDate, double total, Date date, double vat) {
        super(total, date, vat);
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getCvv() {
        return cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
    
    @Override
    public String toString() {
        return "Card{ " + " cvv = " + cvv + ", cardNumber = " + cardNumber + ", expiryDat e= " + expiryDate + " }";
    }
}
