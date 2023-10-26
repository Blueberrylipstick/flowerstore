package ua.edu.ucu.apps.flowerstore.order;

public abstract class Item {
    private String description;
    public abstract double price();
    public abstract String getDescription();
}
