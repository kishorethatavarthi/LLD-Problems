package com.learnings.notificationservice;

public class EmailStrategy implements INotificationStrategy{
	
	private String email;
	
	public EmailStrategy(String email) {
		this.email = email;
	}

	@Override
	public void sendNotification(String content) {
		System.out.println("Sending Email to " + email + " with " + content);
	}
	
}
