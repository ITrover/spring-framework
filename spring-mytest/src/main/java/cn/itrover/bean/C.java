package cn.itrover.bean;

import org.springframework.beans.factory.SmartInitializingSingleton;

public class C implements SmartInitializingSingleton {
	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("C afterSingletonsInstantiated invoked");
	}
}
