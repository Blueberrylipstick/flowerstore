package ua.edu.ucu.apps.flowerstore;

import org.junit.Test;

import ua.edu.ucu.apps.flowerstore.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.payment.PayPalPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.payment.Payment;

import org.junit.jupiter.api.Assertions;

public class PaymentTest {

    @Test
    public void testPay() {
        // Create an instance of CreditCardPaymentStrategy
        CreditCardPaymentStrategy payStrategy1 = new CreditCardPaymentStrategy();
        PayPalPaymentStrategy  payStrategy = new PayPalPaymentStrategy();

        Assertions.assertTrue(payStrategy1 instanceof CreditCardPaymentStrategy);
        Assertions.assertTrue(payStrategy1 instanceof Payment);

        Assertions.assertTrue(payStrategy instanceof PayPalPaymentStrategy);
        Assertions.assertTrue(payStrategy instanceof Payment);

    }
}

