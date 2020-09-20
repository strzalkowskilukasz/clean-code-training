package pl.training.cleancode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.training.cleancode.payments.UUIDPaymentIdGenerator;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UUIDPaymentIdGeneratorTest {

    private static final String ID_FORMAT = "\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}";

    private final UUIDPaymentIdGenerator paymentIdGenerator = new UUIDPaymentIdGenerator();

    @DisplayName("Should generate valid id")
    @Test
    void shouldGenerateValidId() {
        String id = paymentIdGenerator.getNext();
        assertTrue(id.matches(ID_FORMAT));
    }

}
