package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @AllArgsConstructor @ToString @NoArgsConstructor
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;

    public Flower(Flower flower) {
        this.color = flower.color;
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
    }

    public String getColor() {
        return color.toString();
    }
}

