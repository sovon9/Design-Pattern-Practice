package com.cognizant.Observer;

public interface INotificationService {

	/**
	 * 
	 * @param notificationObserver adds INotificationObserver object
	 */
	public void addSubscriber(INotificationObserver notificationObserver);
	
	/**
	 * 
	 * @param notificationObserver removes INotificationObserver object
	 */
	public void removeSubscriber(INotificationObserver notificationObserver);
	
	/**
	 *  notifies all subscribers
	 */
	public void notifySubscriber();
	
}
