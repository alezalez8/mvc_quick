package com.example.services;

import com.example.exception.NotEnoughMoneyException;
import com.example.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final int validId = 1;

    public PaymentDetails processPayment() {

        throw new NotEnoughMoneyException();

    }
}
