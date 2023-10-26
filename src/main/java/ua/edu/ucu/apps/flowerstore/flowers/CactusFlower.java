package ua.edu.ucu.apps.flowerstore.flowers;

import ua.edu.ucu.apps.flowerstore.order.Item;

public class CactusFlower extends Item {
    private double priceOne;

    @Override
    public double price() {
        return priceOne;
    }

    @Override
    public String getDescription() {
        return this.getClass().getSimpleName() + ":" + price();
     }
    
}
