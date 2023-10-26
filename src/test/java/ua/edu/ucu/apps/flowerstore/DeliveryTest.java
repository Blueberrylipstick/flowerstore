package ua.edu.ucu.apps.flowerstore;


import org.junit.Test;


import org.junit.jupiter.api.Assertions;

import ch.qos.logback.core.pattern.PostCompileProcessor;
import ua.edu.ucu.apps.flowerstore.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.delivery.PostDeliveryStrategy;

public class DeliveryTest {

    @Test
    public void testPay() {
        // Create an instance of CreditCardPaymentStrategy
        DHLDeliveryStrategy deliveryStrategy1 = new DHLDeliveryStrategy();
        PostDeliveryStrategy deliveryStrategy2 = new PostDeliveryStrategy();

        Assertions.assertTrue(deliveryStrategy1 instanceof DHLDeliveryStrategy);
        Assertions.assertTrue(deliveryStrategy1 instanceof Delivery);

        Assertions.assertTrue(deliveryStrategy2 instanceof PostDeliveryStrategy);
        Assertions.assertTrue(deliveryStrategy2 instanceof Delivery);

    }
}


