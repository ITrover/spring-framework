package cn.itrover.listeners;

import cn.itrover.listeners.event.MyApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
	@Override
	public void onApplicationEvent(MyApplicationEvent event) {
		if (event.getSource().equals("error")){
			System.out.println("抛出异常了");
			throw new RuntimeException("哈哈哈哈哈");
		}
		System.out.println("收到事件");
		System.out.println(event);
	}
}
