package cn.itrover;

import cn.itrover.bean.B;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
		B b= (B) context.getBean("b");
		System.out.println(b);
	}
}
