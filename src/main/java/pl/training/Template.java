package pl.training;

import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
public class Template {

    private static final String EXPRESSION_START = "\\$\\{";
    private static final String EXPRESSION_END = "}";
    private static final String EXPRESSION = ".*\\$\\{\\w+}.*";
    private static final String INVALID_VALUE = "\\W+";

    private final String textWithExpressions;

    public String evaluate(Map<String, String> parameters) {
        validateParameters(parameters);
        String result = substitute(textWithExpressions, parameters);
        validate(result);
        return result;
    }

    private void validateParameters(Map<String, String> parameters) {
        if (parameters.values().stream().anyMatch(value -> value.matches(INVALID_VALUE))) {
            throw new IllegalArgumentException();
        }
    }

    private String substitute(String textWithExpressions, Map<String, String> parameters) {
        for (Map.Entry<String, String> parameter: parameters.entrySet()) {
            String expression = createExpression(parameter.getKey());
            textWithExpressions = textWithExpressions.replaceAll(expression, parameter.getValue());
        }
        return textWithExpressions;
    }

    private String createExpression(String key) {
        return EXPRESSION_START + key + EXPRESSION_END;
    }

    private void validate(String text) {
        if (text.matches(EXPRESSION)) {
            throw new IllegalArgumentException();
        }
    }

}
