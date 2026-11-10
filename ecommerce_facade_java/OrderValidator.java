package com.ecommerce;

/**
 * Validates the basic fields required to place an order.
 */
public class OrderValidator {

    /**
     * Checks that an order request contains usable identifiers, an address, and a positive amount.
     *
     * @param productId Identifier of the purchased item.
     * @param customerId Identifier of the purchasing customer.
     * @param address Delivery destination.
     * @param amount Total transaction charge.
     * @return true when all required values are present and the amount is positive.
     */
    public boolean validateOrderRequest(String productId, String customerId, String address, double amount) {
        return hasText(productId)
                && hasText(customerId)
                && hasText(address)
                && Double.isFinite(amount)
                && amount > 0;
    }

    private boolean hasText(String value) {
        return value != null && !value.trim().isEmpty();
    }
}
