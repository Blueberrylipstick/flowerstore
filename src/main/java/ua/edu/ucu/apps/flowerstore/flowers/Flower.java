package ua.edu.ucu.apps.flowerstore.flowers;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @AllArgsConstructor @ToString @NoArgsConstructor
@Entity
public class Flower {
    @Id
    private int id;
    private double sepalLength;
    private FlowerColor color;
    private double price;

    // public Flower(Flower flower) {
    //     this.color = flower.color;
    //     this.sepalLength = flower.sepalLength;
    //     this.price = flower.price;
    // }

    // public String getColor() {
    //     return color.toString();
    // }
}

