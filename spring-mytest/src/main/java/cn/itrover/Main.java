package cn.itrover;

import cn.itrover.bean.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user);
	}
}
