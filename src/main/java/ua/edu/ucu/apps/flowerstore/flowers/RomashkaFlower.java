package ua.edu.ucu.apps.flowerstore.flowers;

import ua.edu.ucu.apps.flowerstore.order.Item;

public class RomashkaFlower extends Item{
    private double priceOne;

    @Override
    public double price() {
        return priceOne;  
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
    }
    
}