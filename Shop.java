/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartReceipt;
/**
 *
 * @author DELL
 */
public class Shop {
    
    private String name;
    private String location;
    private String id;

    public Shop(String name, String location, String id) {
        this.name = name;
        this.location = location;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setId(String id) {
        this.id = id;
    }
}
