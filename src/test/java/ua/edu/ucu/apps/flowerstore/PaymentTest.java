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
        CreditCardPaymentStrategy paymentStrategy1 = new CreditCardPaymentStrategy();
        PayPalPaymentStrategy  paymentStrategy2 = new PayPalPaymentStrategy();

        Assertions.assertTrue(paymentStrategy1 instanceof CreditCardPaymentStrategy);
        Assertions.assertTrue(paymentStrategy1 instanceof Payment);

        Assertions.assertTrue(paymentStrategy2 instanceof PayPalPaymentStrategy);
        Assertions.assertTrue(paymentStrategy2 instanceof Payment);

    }
}

