package com.learnings.notificationservice;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
	public static NotificationService service;
	NotificationObservable notificationObservable;
	List<INotification> notifications = new ArrayList<>();
	
	private NotificationService() {
		notificationObservable = new NotificationObservable();
	 }
	
	public static NotificationService getInstance() {
		if(service == null) {
			service = new NotificationService();
		}
		
		return service;
	}
	
	public NotificationObservable getNotificationObservable() {
		return this.notificationObservable;
	}
	
	 void sendNotification(INotification notification) {
		notifications.add(notification);
		notificationObservable.setNotification(notification);
	}

}
