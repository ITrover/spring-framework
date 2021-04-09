package cn.itrover;

import cn.itrover.bean.B;
import cn.itrover.bean.User;
import cn.itrover.listeners.event.MyApplicationEvent;
import cn.itrover.service.IUserService;
import cn.itrover.service.UserServiceFacade;
import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) throws InterruptedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
////		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
//		B b= (B) context.getBean("b");
//		System.out.println(b);
//		UserServiceFacade facade = (UserServiceFacade) context.getBean("userServiceFacade");
//		final ApplicationListener<PayloadApplicationEvent<Object>> listener = ApplicationListener.forPayload(System.out::println);
////		context.registerBean("listener",ApplicationListener.class, listener);
//		String[] names = context.getBeanNamesForType(ApplicationListener.class);
//		context.registerBean("listener", ApplicationListener.class , (Supplier<ApplicationListener<PayloadApplicationEvent<Object>>>) () -> listener);
//		// 使用反射，调用registerListener，再次加载ApplicationListener
//		Class<?> aClass = Class.forName("org.springframework.context.support.AbstractApplicationContext");
//		Method[] methods = context.getClass().getMethods();
//		Method method = context.getClass().getSuperclass().getSuperclass().getDeclaredMethod("registerListeners");
//		method.setAccessible(true);
//		method.invoke(context);
		IUserService userService = (IUserService) context.getBean("userService");
		userService.sayHi();
//		IUserService userService = context.getBean(IUserService.class);
//		User user = userService.getUserById(1);
//		System.out.println(user);
//		context.publishEvent("what happened");
//		context.publishEvent(new MyApplicationEvent("ahhh"));
//		context.publishEvent(new MyApplicationEvent("error"));
//		userService.sayHello();
//		userService.sayHi();
	}
}