package org.example.springstore.payments;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CheckoutResponse {
    private Long orderId;
    private String url;
}
