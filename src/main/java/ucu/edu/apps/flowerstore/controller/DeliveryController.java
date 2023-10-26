package ucu.edu.apps.flowerstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucu.edu.apps.flowerstore.delivery.DHLDeliverystr;
import ucu.edu.apps.flowerstore.delivery.PostDelivery;
import ucu.edu.apps.flowerstore.items.Item;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
    
    private DHLDeliverystr dhlDelivery = new DHLDeliverystr();
    private PostDelivery postDelivery = new PostDelivery();
    
    @GetMapping("/dhl")
    String getDHLDeliverystr() {
        List<Item> dummyItems = new ArrayList<>();
        boolean isDelivered = dhlDelivery.deliver(dummyItems);
        return isDelivered ? "DHL delivery method is successful." : "DHL delivery success.";
    }

    @GetMapping("/post")
    String getPostDeliverystr() {
        List<Item> dummyItems = new ArrayList<>();
        boolean isDelivered = postDelivery.deliver(dummyItems);
        return isDelivered ? "Post delivery method is successful." : "Post delivery success.";
    }
}

