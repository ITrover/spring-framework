package cn.itrover.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectTest {

	@Pointcut("@annotation(cn.itrover.annotation.Log)")
	public void test() {

	}

//	@Before("test()")
	@Before("this(cn.itrover.service.UserService)")
	public void beforeMethod() {
		System.out.println("before method.....");
	}

	@After("execution(void *.*(..))")
//	@After("this(cn.itrover.service.UserService)")
	public void afterMethod() {
		System.out.println("after method.....");
	}

	@AfterReturning("this(cn.itrover.service.UserService)")
	public void afterReturn(){
		System.out.println("after return.....");
	}

}
