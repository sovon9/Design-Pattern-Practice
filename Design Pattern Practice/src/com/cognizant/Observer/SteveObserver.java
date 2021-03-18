package com.cognizant.Observer;

public class SteveObserver implements INotificationObserver {

	public String name;
	
	public SteveObserver(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 *  prints received message
	 */
	@Override
	public void OnServerDown() {

		System.out.println(name+" received the message");
		
	}

	@Override
	public String toString() {
		return "SteveObserver [name=" + name + "]";
	}

}
