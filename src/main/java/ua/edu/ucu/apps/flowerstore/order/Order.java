package ua.edu.ucu.apps.flowerstore.order;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.payment.Payment;

@Getter @Setter @AllArgsConstructor
public class Order {
    private List<Item> itemsList;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public void addItem(Item item) {
        itemsList.add(item);
    }

    public void removeItem(Item item) {
        itemsList.remove(item);
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Item bucket : itemsList) {
            total += bucket.price();
        }
        return total;
    }

    public void processOrder() {
        double totalPrice = calculateTotalPrice();
        payment.pay(totalPrice);
        delivery.deliver(itemsList);
    }
}
