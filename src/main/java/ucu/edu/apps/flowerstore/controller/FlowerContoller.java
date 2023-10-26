package ucu.edu.apps.flowerstore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucu.edu.apps.flowerstore.Flower;
import ucu.edu.apps.flowerstore.FlowerColor;
import ucu.edu.apps.flowerstore.FlowerType;
@RestController
@RequestMapping("/api/flowers")
public class FlowerContoller {
    @GetMapping("/list")
	public List<Flower> getFlower(){
		return  List.of(new Flower(2.2, FlowerColor.RED, 100, FlowerType.CHAMOMILE));
	}
}
