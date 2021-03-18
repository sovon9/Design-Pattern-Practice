package com.cognizant.Observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	/**
	 *   list of all subscribers for notification service
	 */
	public List<INotificationObserver> observers=new ArrayList<>();

	/**
	 *   adds INotificationObserver object
	 */
	@Override
	public void addSubscriber(INotificationObserver notificationObserver) {
		
		observers.add(notificationObserver);
		System.out.println("Subscriber list: "+observers);

	}

	/**
	 *  removes INotificationObserver object
	 */
	@Override
	public void removeSubscriber(INotificationObserver notificationObserver) {

		observers.remove(notificationObserver);
		System.out.println("Subscriber list: "+observers);
		
	}

	/**
	 *  notifies all subscribers
	 */
	@Override
	public void notifySubscriber() {
		
		for(INotificationObserver observer:observers)
		{
			observer.OnServerDown();
		}

	}

}
