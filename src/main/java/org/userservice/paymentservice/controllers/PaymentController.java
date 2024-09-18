package org.userservice.paymentservice.controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.userservice.paymentservice.dtos.CreatePaymentLinkRequestDto;
import org.userservice.paymentservice.dtos.CreatePaymentLinkResponseDto;
import org.userservice.paymentservice.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {

        this.paymentService = paymentService;
    }


    @PostMapping("/")
    public CreatePaymentLinkResponseDto createPaymentLink(@RequestBody CreatePaymentLinkRequestDto request) {
        String url = paymentService.createPaymentLink(request.getOrderId());

        CreatePaymentLinkResponseDto response = new CreatePaymentLinkResponseDto();
        response.setUrl(url);

        return response;
    }

}