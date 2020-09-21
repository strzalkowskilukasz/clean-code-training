package pl.training.cleancode.payments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UUIDPaymentIdGeneratorTest {

    private static final String ID_FORMAT = "\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}";

    private final UUIDPaymentIdGenerator paymentIdGenerator = new UUIDPaymentIdGenerator();

    @DisplayName("Should generate valid id")
    @Test
    void shouldGenerateValidId() {
        var id = paymentIdGenerator.getNext();
        assertTrue(id.matches(ID_FORMAT));
    }

}
