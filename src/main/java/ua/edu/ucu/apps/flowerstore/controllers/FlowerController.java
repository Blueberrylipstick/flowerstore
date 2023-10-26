package ua.edu.ucu.apps.flowerstore.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flowerstore.flowers.Flower;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerColor;

@RestController
@RequestMapping("api/flowers")
public class FlowerController {
    @GetMapping("/list")
	public List<Flower> getFlowers(){
		return List.of(new Flower(12.5, FlowerColor.RED, 20));
	}
}
