package cn.itrover.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

	private B b;

	public A(B b) {
		this.b = b;
	}

	public A(){

	}
}
