package com.learnings.notificationservice;

import java.util.ArrayList;
import java.util.List;

public class NotificationEngine implements IObserver {
	
	NotificationObservable observable;
	List<INotificationStrategy> strategies = new ArrayList<>();
	
	public NotificationEngine() {
		this.observable = NotificationService.getInstance().getNotificationObservable();
		observable.addObserver(this);
	}
	
	public NotificationEngine(NotificationObservable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void addStrategy(INotificationStrategy strategy) {
		strategies.add(strategy);
	}

	@Override
	public void update() {
		String notificationContent = observable.getNotificationContent();
		for(INotificationStrategy strategy : strategies) {
			strategy.sendNotification(notificationContent);
		}
	}

}
