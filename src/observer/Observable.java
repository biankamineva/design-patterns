package observer;

public interface Observable {
	void stateobserv(Observer observer);
	void stopobserv(Observer observer);
	
	void notifyObservers();
	String getUpdate();
}
