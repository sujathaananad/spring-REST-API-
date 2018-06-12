package srm.curd.interceptor;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class StudentAfterAdvice {
	
	@After("execution(* *.*(..)) && within(srm.curd.dao..*)")
	public void logBefore(JoinPoint joinPoint) {
		long end = System.currentTimeMillis();
		System.out.println("current time "+end);
		System.out.println("logAfter() is running!");
		System.out.println("student : " + joinPoint.getSignature().getName());
		System.out.println("******");
		
	}

}
