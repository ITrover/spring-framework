package cn.itrover.listeners.event;

import org.springframework.context.ApplicationEvent;

/**
 * 事件
 */
@SuppressWarnings("serial")
public class MyApplicationEvent extends ApplicationEvent {

	public MyApplicationEvent(Object source) {
		super(source);
	}

}
