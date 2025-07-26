package com.learnings.notificationservice;

public class Client {
	public static void main(String[] args) {
		NotificationService  notificationService = NotificationService.getInstance();
		
		NotificationEngine engine = new NotificationEngine();
		engine.addStrategy(new EmailStrategy("abc@example.com"));
		engine.addStrategy(new SMSStrategy("9876543210"));
		
		INotification notification = new SimpleNotification("Your item is delivered");
		notification = new TimeStampDecorator(notification);
		notification = new SignatureDecorator(notification, "kishore");
		
		notificationService.sendNotification(notification);
	}

}
