package org.example.springstore.payments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.springstore.orders.PaymentStatus;

@AllArgsConstructor
@Getter
public class PaymentResult {
    private Long orderId;
    private PaymentStatus paymentStatus;
}
