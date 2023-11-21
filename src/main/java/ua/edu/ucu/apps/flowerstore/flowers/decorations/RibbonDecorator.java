package ua.edu.ucu.apps.flowerstore.flowers.decorations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.order.Item;

@Getter
public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(Item item) {
        super(item);
        //TODO Auto-generated constructor stub
    }

    private Item item;
    private int addition = Integer.valueOf("40");

    public double getPrice() {
        return addition + super.getPrice();
    }

    public String getDescription() {
        return this.getClass().getSimpleName() + ":" + getPrice();
    }
}
