package pl.training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static java.util.Collections.emptyMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TemplateTest {

    private final Template template = new Template("My name is ${firstName} ${lastName}");

    @DisplayName("Should evaluate text with expressions")
    @Test
    void shouldEvaluateTextWithExpressions() {
        Map<String, String> parameters = Map.of("firstName", "Jan", "lastName", "Kowalski");
        assertEquals("My name is Jan Kowalski", template.evaluate(parameters));
    }

    @DisplayName("Should throw exception when parameter is missing")
    @Test
    void shouldThrowExceptionWhenParameterIsMissing() {
        assertThrows(IllegalArgumentException.class, () ->  template.evaluate(emptyMap()));
    }

    @DisplayName("Should accept only alpha-numeric values")
    @Test
    void shouldAcceptOnlyAlphaNumericValues() {
        Map<String, String> parameters = Map.of("firstName", "**", "lastName", "Kowalski");
        assertThrows(IllegalArgumentException.class, () ->  template.evaluate(parameters));
    }

}
