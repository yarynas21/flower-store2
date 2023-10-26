package ucu.edu.apps.flowerstore.delivery;

import ucu.edu.apps.flowerstore.items.Item;

import java.util.List;

public interface Delivery {
    boolean deliver(List<Item> items);
}
