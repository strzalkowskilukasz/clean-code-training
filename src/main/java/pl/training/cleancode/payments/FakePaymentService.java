package pl.training.cleancode.payments;

import lombok.RequiredArgsConstructor;

import java.time.Instant;

@RequiredArgsConstructor
public class FakePaymentService implements PaymentService {

    private final PaymentIdGenerator paymentIdGenerator;

    @Override
    public Payment process(PaymentRequest paymentRequest) {
        return Payment.builder()
                .id(paymentIdGenerator.getNext())
                .money(paymentRequest.getMoney())
                .timestamp(Instant.now())
                .status(PaymentStatus.STARTED)
                .build();
    }

}
