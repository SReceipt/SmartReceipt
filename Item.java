package SmartReceipt;

public class Item {

    private String name;
    private int quantity;
    private double price;
    private String description;
    private int insurance;

    public Item(String name, int quantity, double price, int insurance, String description) {
        this.name = name;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    @Override
    public String toString() {
        return "Item{" + "Name: " + name + ", Price: " + price + ", Description: " + description + ", Insurance: " + insurance + '}';
    }

    

}
