package com.example.controllers;


import com.example.model.PaymentDetails;
import com.example.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;


    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment() {
        PaymentDetails paymentDetails = paymentService.processPayment();
       // PaymentDetails paymentDetails = new PaymentDetails();

        return ResponseEntity
                //.badRequest()
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);

    }
}
