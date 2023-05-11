/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartReceipt;
/**
 *
 * @author DELL
 */
public class Item {

    private String name;
    private double price;
    private String description;
    private int insurance;

    public Item(String name, double price, String description, int insurance) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.insurance = insurance;        
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the insurance
     */
    public int getInsurance() {
        return insurance;
    }

    /**
     * @param insurance the insurance to set
     */
    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    

}
