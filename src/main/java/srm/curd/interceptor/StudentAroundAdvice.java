package srm.curd.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAroundAdvice {
    
    /*@Around("execution(* *.*(..)) && within(srm.curd.dao..*)")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
            long start = System.currentTimeMillis();
            System.out.println("Going to call the method.");
            Object output = pjp.proceed();
            System.out.println("Method execution completed.");
            long elapsedTime = System.currentTimeMillis() - start;
            System.out.println("Method execution time: " + elapsedTime + " milliseconds.");
            return output;
    }*/

    @Around("execution(* *.*(..)) && within(srm.curd.dao..*)")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
            long start = System.currentTimeMillis();
            System.out.println("Going to call the method.");
            Object output = pjp.proceed();
            System.out.println("Method execution completed.");
            long elapsedTime = System.currentTimeMillis() - start;
            System.out.println("Method execution time: " + elapsedTime + " milliseconds.");
			return output;
          
    }

}
