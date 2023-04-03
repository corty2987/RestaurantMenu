package restaurant;

import java.util.Date;

public class MenuItem {
    //declare private fields name, description, price, category, and dateAdded(Date)
    private String name;
    private String description;
    private double price;
    private String category;
    private Date dateAdded;

    //Define constructor to take values for first four fields as parameters
    //initialize dateAdded to the current date

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date();
    }


}
