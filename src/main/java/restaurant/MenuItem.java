package restaurant;

import java.util.Date;

public class MenuItem {
    //declare private fields name, description, price, category, and dateAdded(Date)
    private String name;
    private String description;
    private double price;
    private String category;
    private Date dateAdded;
    private Boolean isNew;


    //Define constructor to take values for first four fields as parameters
    //initialize dateAdded to the current date

    public MenuItem(String name, String description, double price, String category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
        this.dateAdded = new Date();
    }

    public String getName() {
        return name;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
