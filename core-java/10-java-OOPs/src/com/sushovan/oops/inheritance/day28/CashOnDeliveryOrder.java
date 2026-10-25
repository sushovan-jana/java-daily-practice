package com.sushovan.oops.inheritance.day28;

public class CashOnDeliveryOrder extends Order {

    String deliveryAddress;
    int codCharge;
    boolean isAmountCollected;

    public CashOnDeliveryOrder(String orderId, int amount, String orderStatus,
            String customerName, String orderDate, String deliveryAddress,
            int codCharge, boolean isAmountCollected) {

        super(orderId, amount, orderStatus, customerName, orderDate);

        this.deliveryAddress = deliveryAddress;
        this.codCharge = codCharge;
        this.isAmountCollected = isAmountCollected;
    }

    @Override
    public int calculateFinalAmount() {
        int superAmount = super.calculateFinalAmount();
        int finalAmount = superAmount + codCharge;
        return finalAmount;
    }

    @Override
    public void processOrder() {
        if ("CANCELLED".equalsIgnoreCase(orderStatus)) {
            System.out.println("Cannot process a cancelled order.");
            return;
        }

        orderStatus = "PROCESSING";
        System.out.println("Cash-on-delivery order is under processing.");
    }

    @Override
    public void cancelOrder() {
        if (isAmountCollected) {
            System.out.println("Payment has already been collected. Please check the refund process.");
            return;
        }

        if ("CANCELLED".equalsIgnoreCase(orderStatus)) {
            System.out.println("Order is already cancelled.");
            return;
        }

        orderStatus = "CANCELLED";
        System.out.println("Cash-on-delivery order cancelled successfully.");
    }

    public void collectPayment() {
        if (isAmountCollected) {
            System.out.println("Payment has already been collected.");
            return;
        }

        if (!"DELIVERED".equalsIgnoreCase(orderStatus)) {
            System.out.println("Payment can be collected after the order is delivered.");
            return;
        }

        isAmountCollected = true;
        System.out.println("Cash-on-delivery payment of Rs. "
                + calculateFinalAmount() + "/- has been collected.");
    }
}