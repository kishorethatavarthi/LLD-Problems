package com.learnings.notificationservice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStampDecorator extends INotificationDecorator{

	public TimeStampDecorator(INotification notification) {
		super(notification);
	}

	@Override
	public String getContent() {
		LocalDateTime now = LocalDateTime.now();
        String formatted = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		return notification.getContent() + formatted;
	}
	
}
