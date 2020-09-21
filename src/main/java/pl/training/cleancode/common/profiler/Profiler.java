package pl.training.cleancode.common.profiler;

import lombok.extern.java.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Order(10)
@Aspect
@Log
public class Profiler {

    @Around("execution(* pl.training.cleancode.payments.FakePaymentService.process(..))")
    //@Around("bean(paymentService)")
    //@Around("@annotation(ExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        var startTime = System.nanoTime();
        var result = proceedingJoinPoint.proceed();
        var totalTime = System.nanoTime() - startTime;
        log.info(String.format("%s executed in %d ns", proceedingJoinPoint.getSignature(), totalTime));
        return result;
    }

}
