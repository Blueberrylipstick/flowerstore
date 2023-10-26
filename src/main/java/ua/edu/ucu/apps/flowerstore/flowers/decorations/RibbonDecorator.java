package ua.edu.ucu.apps.flowerstore.flowers.decorations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.order.Item;

@Getter @AllArgsConstructor
public class RibbonDecorator {
    private Item item;

    public double getPrice(){
        return 40 + item.price();
    }

    String getDescription(){
        return this.getClass().getSimpleName() + ":" + getPrice();
    }
}