package com.learnings.notificationservice;

import java.util.ArrayList;
import java.util.List;

public class NotificationObservable implements IObservable{

	List<IObserver> observers = new ArrayList<>();
	
	INotification notification;
	
	
	@Override
	public void addObserver(IObserver observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObserver() {
		for(IObserver observer : observers) {
			observer.update();
		}
	}
	
	public void setNotification(INotification notification) {
		this.notification = notification;
		notifyObserver();
	}
	
	public INotification getNotification() {
		return this.notification;
	}
	
	public String getNotificationContent() {
		return notification.getContent();
	}

}
