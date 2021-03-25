package cn.itrover.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class A implements InitializingBean {

	private B b;

//	public void setB(B b) {
//		// 设置属性b
//		System.out.println("设置属性b");
//		this.b = b;
//	}

	public A(B b) {
		this.b = b;
	}

	public A(){

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("属性设置了");
	}

}
