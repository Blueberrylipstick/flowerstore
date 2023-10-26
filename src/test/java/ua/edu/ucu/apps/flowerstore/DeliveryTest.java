package ua.edu.ucu.apps.flowerstore;


import org.junit.Test;


import org.junit.jupiter.api.Assertions;

import ua.edu.ucu.apps.flowerstore.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.delivery.PostDeliveryStrategy;

public class DeliveryTest {

    @Test
    public void testPay() {
        // Create an instance of CreditCardPaymentStrategy
        DHLDeliveryStrategy DeliveryStrategy1 = new DHLDeliveryStrategy();
        PostDeliveryStrategy DeliveryStrategy = new PostDeliveryStrategy();

        Assertions.assertTrue(DeliveryStrategy1 instanceof DHLDeliveryStrategy);
        Assertions.assertTrue(DeliveryStrategy1 instanceof Delivery);

        Assertions.assertTrue(DeliveryStrategy instanceof PostDeliveryStrategy);
        Assertions.assertTrue(DeliveryStrategy instanceof Delivery);

    }
}


