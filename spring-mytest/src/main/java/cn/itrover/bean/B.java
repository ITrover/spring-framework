package cn.itrover.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class B {

	private A a;

	public B(A a) {
		this.a = a;
	}

	@Autowired
	public void setA(A a) {
		this.a = a;
	}

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public User user() {
		return new User("1", "itrover");
	}

}
