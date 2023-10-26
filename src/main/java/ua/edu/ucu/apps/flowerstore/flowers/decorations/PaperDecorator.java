package ua.edu.ucu.apps.flowerstore.flowers.decorations;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.order.Item;

@Getter
public class PaperDecorator {
    public Item item;

    public double getPrice(){
        return 13 + item.price();
    }

    String getDescription(){
        return this.getClass().getSimpleName() + ":" + getPrice();
    }
}
