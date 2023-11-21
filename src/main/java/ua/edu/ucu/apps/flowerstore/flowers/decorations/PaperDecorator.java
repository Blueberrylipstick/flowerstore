package ua.edu.ucu.apps.flowerstore.flowers.decorations;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.order.Item;

@Getter 
public class PaperDecorator extends ItemDecorator {
    private Item item;
    private int addition = Integer.valueOf("13");

    public PaperDecorator(Item item) {
        super(item);
        //TODO Auto-generated constructor stub
    }

    public double getPrice() {
        return super.getPrice() + addition;
    }

    public String getDescription() {
        return this.getClass().getSimpleName() + ":" + getPrice();
    }
}
