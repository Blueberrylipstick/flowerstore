package ua.edu.ucu.apps.flowerstore.flowers.decorations;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.order.Item;

@Getter
public class BasketDecorator extends ItemDecorator {
    private Item item;
    private int addition = Integer.valueOf("4");
    
    public BasketDecorator(Item item) {
        super(item);
        //TODO Auto-generated constructor stub
    }

    public double getPrice() {
        return addition + super.getPrice();
    }

    public String getDescription() {
        return this.getClass().getSimpleName() + ":" + getPrice();
    }
}
