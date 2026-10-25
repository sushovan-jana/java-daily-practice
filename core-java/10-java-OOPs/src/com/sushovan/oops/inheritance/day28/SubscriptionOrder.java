package com.sushovan.oops.inheritance.day28;

public class SubscriptionOrder extends Order {

    int subscriptionId;
    int subscriptionDuration;
    String renewalDate;
    boolean isAutoRenewEnabled;

    public SubscriptionOrder(String orderId, int amount, String orderStatus,
            String customerName, String orderDate,
            int subscriptionId, int subscriptionDuration,
            String renewalDate, boolean isAutoRenewEnabled) {

        super(orderId, amount, orderStatus, customerName, orderDate);

        this.subscriptionId = subscriptionId;
        this.subscriptionDuration = subscriptionDuration;
        this.renewalDate = renewalDate;
        this.isAutoRenewEnabled = isAutoRenewEnabled;
    }

    @Override
    public int calculateFinalAmount() {
        return amount;
    }

    @Override
    public void processOrder() {
        orderStatus = "ACTIVE";
        System.out.println("Subscription order processed successfully.");
    }

    @Override
    public void cancelOrder() {
        orderStatus = "CANCELLED";
        isAutoRenewEnabled = false;
        System.out.println("Subscription order cancelled successfully.");
    }

    public void renewSubscription() {
        if (isAutoRenewEnabled) {
            System.out.println("Subscription renewed successfully.");
        } else {
            System.out.println("Auto-renewal is disabled.");
        }
    }

    public void enableAutoRenewal() {
        isAutoRenewEnabled = true;
        System.out.println("Auto-renewal enabled.");
    }

    public void disableAutoRenewal() {
        isAutoRenewEnabled = false;
        System.out.println("Auto-renewal disabled.");
    }
}