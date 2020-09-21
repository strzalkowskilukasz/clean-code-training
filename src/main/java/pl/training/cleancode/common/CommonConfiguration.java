package pl.training.cleancode.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import pl.training.cleancode.common.profiler.Profiler;
import pl.training.cleancode.common.retry.MethodExecutor;
import pl.training.cleancode.common.validator.ModelValidator;
import pl.training.cleancode.common.validator.ValidatorService;

import javax.validation.Validator;

@Configuration
public class CommonConfiguration {

    @Bean
    public Profiler profiler() {
        return new Profiler();
    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }

    @Bean
    public ValidatorService validatorService(Validator validator) {
        return new ValidatorService(validator);
    }

    @Bean
    public ModelValidator modelValidator(ValidatorService validatorService) {
        return new ModelValidator(validatorService);
    }

    @Bean
    public MethodExecutor methodExecutor() {
        return new MethodExecutor();
    }

}
