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
        DHLDeliveryStrategy deliveryStrateggy = new DHLDeliveryStrategy();
        PostDeliveryStrategy deliveryStrategy = new PostDeliveryStrategy();

        Assertions.assertTrue(deliveryStrateggy instanceof DHLDeliveryStrategy);
        Assertions.assertTrue(deliveryStrateggy instanceof Delivery);

        Assertions.assertTrue(deliveryStrategy instanceof PostDeliveryStrategy);
        Assertions.assertTrue(deliveryStrategy instanceof Delivery);

    }
}


