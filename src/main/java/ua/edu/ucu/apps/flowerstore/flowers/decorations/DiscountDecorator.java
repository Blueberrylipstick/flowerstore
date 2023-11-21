package ua.edu.ucu.apps.flowerstore.flowers.decorations;

import ua.edu.ucu.apps.flowerstore.order.Item;

public class DiscountDecorator extends ItemDecorator {

    public DiscountDecorator(Item item) {
        super(item);
        //TODO Auto-generated constructor stub
    }
    
    public double getPrice() {
        return super.getPrice() * Double.valueOf("0.8");
    }
}
