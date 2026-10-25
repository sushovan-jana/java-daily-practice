package com.sushovan.oops.inheritance.day28;

public class PrepaidOrder extends Order {

    String paymentTransactionId;
    String paymentStatus;
    int discountAmount;

    public PrepaidOrder(String orderId, int amount, String orderStatus,
            String customerName, String orderDate,
            String paymentTransactionId, String paymentStatus,
            int discountAmount) {

        super(orderId, amount, orderStatus, customerName, orderDate);

        this.paymentTransactionId = paymentTransactionId;
        this.paymentStatus = paymentStatus;
        this.discountAmount = discountAmount;
    }

    @Override
    public int calculateFinalAmount() {
        int superAmount = super.calculateFinalAmount();

        if (discountAmount < 0) {
            throw new IllegalArgumentException("Discount amount cannot be negative.");
        }

        int finalAmount = superAmount - discountAmount;

        return Math.max(finalAmount, 0);
    }

    @Override
    public void processOrder() {
        if ("CANCELLED".equalsIgnoreCase(orderStatus)) {
            System.out.println("Cannot process a cancelled order.");
            return;
        }

        if (!"SUCCESS".equalsIgnoreCase(paymentStatus)) {
            System.out.println("Order cannot be processed because payment is not successful.");
            return;
        }

        orderStatus = "PROCESSING";
        System.out.println("Prepaid order is under processing.");
    }

    @Override
    public void cancelOrder() {
        if ("CANCELLED".equalsIgnoreCase(orderStatus)) {
            System.out.println("Prepaid order is already cancelled.");
            return;
        }

        orderStatus = "CANCELLED";
        System.out.println("Prepaid order has been cancelled.");

        if ("SUCCESS".equalsIgnoreCase(paymentStatus)) {
            System.out.println("Refund can be initiated for transaction: "
                    + paymentTransactionId);
        }
    }

    public void validatePayment() {
        if (paymentTransactionId == null || paymentTransactionId.trim().isEmpty()) {
            System.out.println("Payment validation failed: transaction ID is missing.");
            return;
        }

        if ("SUCCESS".equalsIgnoreCase(paymentStatus)) {
            System.out.println("Prepaid order payment has been validated.");
        } else {
            System.out.println("Prepaid order payment has not been completed successfully.");
        }
    }
}