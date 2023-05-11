/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartReceipt;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        //Shop [name, location, id] Customer [name, id] Receipt[receiptId] Item [name, price, description, insurance] 
        //[type of payment] Payment[total, date, vat] Crypto[publicKey] Cash[change, amountPaid] Card[cvv,cardNumber,  expiryDate]

        Shop shop = new Shop(args[0], args[1], args[2]);
        Customer customer = new Customer(args[3], args[4]);
        
        switch(Integer.parseInt(args[10])) {
            case 1:
                Payment payment = new Cash(args[15], args[16], args[11], args[12], args[13]);
                
        }


        
    }
}
