package cn.itrover.service;


import cn.itrover.bean.User;

public interface IUserService {
	void sayHello();

	void sayHi();

	User getUserById(Integer id);
}

