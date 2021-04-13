package observer;

public class ObserverMain {

	public static void main(String[] args) {

		State state = new State();
		Observer obsr1 = new StateObserver("State observer 1");
		Observer obsr2 = new StateObserver("State observer 2");
		Observer obsr3 = new StateObserver("State observer 3");

		state.stateobserv(obsr1);
		state.stateobserv(obsr2);
		state.stateobserv(obsr3);
		
		state.setState("Open");
		state.setState("Closed");
	}

}
