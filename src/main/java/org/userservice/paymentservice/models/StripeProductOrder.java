package org.userservice.paymentservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StripeProductOrder extends BaseModel {
    private Long productId;
    private String stripePriceId;
    private String stripeProductId;

}
