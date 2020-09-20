package pl.training.cleancode;

import lombok.extern.java.Log;
import pl.training.cleancode.payments.*;

@Log
public class Application {

    public static void main(String[] args) {
        var paymentIdGenerator = new IncrementalPaymentIdGenerator();
        var fakePaymentService = new FakePaymentService(paymentIdGenerator);
        var paymentService = new LoggingPaymentService(fakePaymentService);
        var paymentRequest = PaymentRequest.builder()
                .money(LocalMoney.of(1_000))
                .build();
        var payment = paymentService.process(paymentRequest);
        log.info(payment.toString());
    }

}
