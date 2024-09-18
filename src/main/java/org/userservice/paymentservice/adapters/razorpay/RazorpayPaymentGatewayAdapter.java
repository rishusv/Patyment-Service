package org.userservice.paymentservice.adapters.razorpay;

import org.userservice.paymentservice.adapters.PaymentGatewayAdapter;

public class RazorpayPaymentGatewayAdapter implements PaymentGatewayAdapter {
    @Override
    public String createPaymentLink(Long price) {
        return null;
    }
}