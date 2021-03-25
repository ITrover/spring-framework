package cn.itrover.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("当前的Bean是" + beanName);
		System.out.println("MyBeanPostProcessor postProcessBeforeInitialization 执行了");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("当前的Bean是" + beanName);
		System.out.println("MyBeanPostProcessor postProcessAfterInitialization 执行了");
		return null;
	}
}
