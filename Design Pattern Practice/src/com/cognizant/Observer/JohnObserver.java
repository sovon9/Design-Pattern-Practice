package com.cognizant.Observer;

public class JohnObserver implements INotificationObserver {

	public String name;
	
	public JohnObserver(String name) {
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
		return "JohnObserver [name=" + name + "]";
	}

}
