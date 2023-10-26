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
        CreditCardPaymentStrategy payStrateg = new CreditCardPaymentStrategy();
        PayPalPaymentStrategy  payStrategy = new PayPalPaymentStrategy();

        Assertions.assertTrue(payStrateg instanceof CreditCardPaymentStrategy);
        Assertions.assertTrue(payStrateg instanceof Payment);

        Assertions.assertTrue(payStrategy instanceof PayPalPaymentStrategy);
        Assertions.assertTrue(payStrategy instanceof Payment);

    }
}

