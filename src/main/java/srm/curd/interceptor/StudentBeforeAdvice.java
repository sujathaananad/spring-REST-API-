package srm.curd.interceptor;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class StudentBeforeAdvice {
	
	@Before("execution(* *.*(..)) && within(srm.curd.dao..*)")
	public void logBefore(JoinPoint joinPoint) {
		long start = System.currentTimeMillis();
		System.out.println("current time "+start);
		System.out.println("logBefore() is running!");
		System.out.println("student : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

}
