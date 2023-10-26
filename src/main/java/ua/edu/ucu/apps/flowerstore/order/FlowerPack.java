package ua.edu.ucu.apps.flowerstore.order;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.flowers.Flower;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.flower.getPrice() * this.quantity;
    }

    public void setQuantity(int newQuantity) {
        if (newQuantity < 1) {
            this.quantity = 1;
        } else {
            this.quantity = newQuantity;
        }
    }
}
