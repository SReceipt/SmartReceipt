package SmartReceipt;

import java.awt.font.TextAttribute;
import java.awt.im.InputMethodHighlight;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SmartReceipt {

    
    public static void main(String[] args) {
        Shop shop = new Shop("SReceipt supermarket", "Zayed City", 15423, 0.05);
        Scanner input = null;
        try {
            File file = new File("cart.txt");
            input = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.print("Empy cart");
            System.exit(0);
        }
        
        System.out.println("Welcome to " + shop.getName());
        
        // Scanning items
        ArrayList<Item> items = new ArrayList<>();
        while(input.hasNext()) {
            // System.out.println("" + input.next() + ", " + input.nextInt() + ", " + input.nextDouble() + ", " + input.nextInt() + ", " + input.nextLine());
            Item item = new Item(input.next(), input.nextInt(), input.nextDouble(), input.nextInt(), input.nextLine());
            items.add(item);
        }
        
        input.close();
        
        input = new Scanner(System.in);
        String paymenyMethod = "";
        System.out.println("\nPlese select ur payment method: \n1. Cryptocurrency\n2. Card\n3. Cash\n");
        int choice = 0;
        do {
            choice = input.nextInt();
            switch (choice) {
            case 1:
                paymenyMethod += "Cryptocurrency";
                break;
                
            case 2:
                paymenyMethod += "Card";
                break;
                
            case 3:
                paymenyMethod += "Cash";
                break;
                
            default:
                System.out.println("Invalid choice, please select options from 1 to 3");
        }
        } while (choice < 1 || choice > 3);
        
        System.out.println("\nPlease enter your wallet ID");
        
        String customerID = input.next();
        
        shop.newReceipt(items, paymenyMethod, customerID);
        
        System.out.println("\nThank you for shopping at " + shop.getName());
        System.out.println("You will receive your smart receipt in your digital wallet");
    }
    
}
