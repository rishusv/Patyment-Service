package org.userservice.paymentservice.adapters;

public interface PaymentGatewayAdapter {
    String createPaymentLink(Long price) throws Exception;
}
