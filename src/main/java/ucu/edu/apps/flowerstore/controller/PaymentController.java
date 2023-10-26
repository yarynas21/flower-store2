package ucu.edu.apps.flowerstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @GetMapping("/paypal")
    String getPayment() {
        return "PayPal woooooo";
    }

    @GetMapping("/creditcard")
    String getPayPalPayment() {
        return "Credit Card topppppp";
    }
}
