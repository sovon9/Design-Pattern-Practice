package com.cognizant.Observer;

public class Main {

	public static void main(String[] args) {

		/**
		 *  create observes
		 */
		INotificationObserver notificationObserver1=new SteveObserver("Steve");
		INotificationObserver notificationObserver2=new JohnObserver("John");
		
		INotificationService notificationService=new NotificationService();
		
		/**
		 *   add subscribers
		 */
		notificationService.addSubscriber(notificationObserver1);
		notificationService.addSubscriber(notificationObserver2);
		
		/**
		 *  notify subscribers
		 */
		notificationService.notifySubscriber();
		
		// remove subscriber
		notificationService.removeSubscriber(notificationObserver1);
		
		notificationService.notifySubscriber();
		
	}

}
