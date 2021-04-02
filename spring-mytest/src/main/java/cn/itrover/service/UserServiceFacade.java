package cn.itrover.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
@ComponentScan
public class UserServiceFacade {
	private final IUserService userService;

	public UserServiceFacade(IUserService userService) {
		this.userService = userService;
	}

	public void sayHello() {
		userService.sayHello();
	}

	public void sayHi() {
		userService.sayHi();
	}
}
