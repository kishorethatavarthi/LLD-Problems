package com.learnings.notificationservice;

public abstract class INotificationDecorator implements INotification{

	INotification notification;
	
	public INotificationDecorator(INotification notification) {
		this.notification = notification;
	}

}
