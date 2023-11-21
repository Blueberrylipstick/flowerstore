package ua.edu.ucu.apps.flowerstore.flowers;

import ua.edu.ucu.apps.flowerstore.order.Item;

public class RomashkaFlower extends Item {
    private double priceOne;

    @Override
    public double getPrice() {
        return priceOne;  
    }

    @Override
    public String getDescription() {
        return this.getClass().getSimpleName() + ":" + getPrice();
    }
    
}
