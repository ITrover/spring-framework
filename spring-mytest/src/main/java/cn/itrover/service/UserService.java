package cn.itrover.service;

import cn.itrover.annotation.Log;
import cn.itrover.bean.User;
import cn.itrover.dao.IUserDao;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Log
@Service
@Lazy
public class UserService implements IUserService{

	private final User user;

	private final IUserDao userDao;

	public UserService(User user, IUserDao userDao) {
		this.user = user;
		this.userDao = userDao;
	}

//	public UserService(User user) {
//		this.user = user;
//	}

	public void sayHello() {
		System.out.println(user);
	}

	@Override
	public void sayHi() {
		System.out.println("hi...");
	}

	@Override
	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}
}
