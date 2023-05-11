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
public class Crypto extends Payment{
    
    private String publicKey;

    public Crypto(String publicKey, double total, Date date, double vat) {
        super(total, date, vat);
        this.publicKey = publicKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
