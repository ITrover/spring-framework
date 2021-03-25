package cn.itrover.service;

import cn.itrover.annotation.Log;
import cn.itrover.bean.User;
import org.springframework.stereotype.Service;

@Log
@Service
public class UserService implements IUserService{

	private final User user;

	public UserService(User user) {
		this.user = user;
	}

	public void sayHello() {
		System.out.println(user);
	}

	@Override
	public void sayHi() {
		System.out.println("hi...");
	}
}
