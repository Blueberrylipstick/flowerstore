package ua.edu.ucu.apps.flowerstore.order;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item{
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public double price() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void addFlowers(FlowerPack pack) {
        flowerPacks.add(pack);
    }

    public void searchFlowers(){

    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
    }

}
