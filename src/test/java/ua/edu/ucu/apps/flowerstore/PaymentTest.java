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
        CreditCardPaymentStrategy PaymentStrategy1 = new CreditCardPaymentStrategy();
        PayPalPaymentStrategy  PaymentStrategy = new PayPalPaymentStrategy();

        Assertions.assertTrue(PaymentStrategy1 instanceof CreditCardPaymentStrategy);
        Assertions.assertTrue(PaymentStrategy1 instanceof Payment);

        Assertions.assertTrue(PaymentStrategy instanceof PayPalPaymentStrategy);
        Assertions.assertTrue(PaymentStrategy instanceof Payment);

    }
}

