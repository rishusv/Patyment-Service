package org.userservice.paymentservice.adapters;
import java.util.Random;

import org.springframework.stereotype.Service;
import org.userservice.paymentservice.adapters.stripe.StripePaymentGatewayAdapter;


@Service
public class PaymentGatewayStrategy {
    private static Random random = new Random();
    private final StripePaymentGatewayAdapter stripePaymentGatewayAdapter;

    public PaymentGatewayStrategy(StripePaymentGatewayAdapter stripePaymentGatewayAdapter) {
        this.stripePaymentGatewayAdapter = stripePaymentGatewayAdapter;
    }

    public PaymentGatewayAdapter getPaymentGateway() {


        // int isEven = random.nextInt(100);

        return stripePaymentGatewayAdapter;
        // if (isEven % 2 == 0) {
        //     return new RazorpayPaymentGatewayAdapter();
        // } else {
        //     return new StripePaymentGatewayAdapter();
        // }
    }

}
