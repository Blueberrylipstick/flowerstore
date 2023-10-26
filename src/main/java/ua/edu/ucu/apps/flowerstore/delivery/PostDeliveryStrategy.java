package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.order.Item;

@Getter
public class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deliver'");
    }
    
}
