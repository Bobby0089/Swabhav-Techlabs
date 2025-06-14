package com.company.behavioural.observer.model;

public interface Subject {

	void registerObserver(Observer observer);
	
	void removeObserver(Observer observer);
	
	void notifyObserver();
}
