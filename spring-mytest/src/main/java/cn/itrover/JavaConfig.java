package cn.itrover;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.annotation.*;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;


@Configuration
@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
@ComponentScan
public class JavaConfig implements BeanFactoryAware {

	private BeanFactory beanFactory;

	@Bean
	public ApplicationEventMulticaster applicationEventMulticaster(){
		SimpleApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster();
		multicaster.setBeanFactory(beanFactory);
		// 添加一个线程池
		multicaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
		multicaster.setErrorHandler(t -> System.out.println("异常被我捕获" + t.getMessage()));
		return multicaster;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	/**
	 * 注册一个处理Payload事件的监听器
	 * @return
	 */
//	@Bean
//	public ApplicationListener<PayloadApplicationEvent<String>> applicationListener(){
//		return ApplicationListener.forPayload(s -> {
//			System.out.println("payload listener save the event");
//			System.out.println(s);
//		});
//	}
}
