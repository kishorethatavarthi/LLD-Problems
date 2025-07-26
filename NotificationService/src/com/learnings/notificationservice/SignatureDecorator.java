package com.learnings.notificationservice;

public class SignatureDecorator extends INotificationDecorator{

	private String signature;
	
	public SignatureDecorator(INotification notification,String signature) {
		super(notification);
		this.signature = signature;
	}

	@Override
	public String getContent() {
		return notification.getContent() + "with signature " + signature;
	}

}
