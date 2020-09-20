package pl.training.cleancode;

import lombok.extern.java.Log;
import pl.training.cleancode.payments.FakePaymentService;
import pl.training.cleancode.payments.IncrementalPaymentIdGenerator;
import pl.training.cleancode.payments.LocalMoney;
import pl.training.cleancode.payments.PaymentRequest;

@Log
public class Application {

    public static void main(String[] args) {
        var paymentIdGenerator = new IncrementalPaymentIdGenerator();
        var paymentService = new FakePaymentService(paymentIdGenerator);
        var paymentRequest = PaymentRequest.builder()
                .money(LocalMoney.of(1_000))
                .build();
        var payment = paymentService.process(paymentRequest);
        log.info(payment.toString());
    }

}
