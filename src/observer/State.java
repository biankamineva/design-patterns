package observer;

import java.util.ArrayList;
import java.util.List;

public class State implements Observable {
	
	private List<Observer> stateObservers;
	private String state;

	public State() {
		
		this.stateObservers = new ArrayList<>();
	}

	@Override
	public void stateobserv(Observer observer) {
		
		this.stateObservers.add(observer);
		observer.setState(this);
	}

	@Override
	public void stopobserv(Observer observer) {
		
		this.stateObservers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.stateObservers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		
		return this.state;
		
	}

	public void setState(String state) {
		this.state = state;
		this.notifyObservers();
	}

}
