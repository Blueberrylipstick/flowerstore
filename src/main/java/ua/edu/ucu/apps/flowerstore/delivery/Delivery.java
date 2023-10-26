package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;

import ua.edu.ucu.apps.flowerstore.order.Item;

public interface Delivery {
    String address = "";

    void deliver(List<Item> items);
}
