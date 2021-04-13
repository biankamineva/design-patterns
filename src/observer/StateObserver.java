package observer;

public class StateObserver implements Observer {
	
	private String name;
	private Observable subscribeTo;

	public StateObserver(String name) {
		this.name = name ;
	}

	@Override
	public void update() {
		if(this.subscribeTo == null) {
			System.out.println(this.getName() + " has no new state.");
			return;
		}
		String newState = this.subscribeTo.getUpdate();
		System.out.println(this.getName() + " new update: " + newState);
	}

	@Override
	public void setState(Observable state) {
		this.subscribeTo = state;
	}

	public String getName() {
		return name;
	}

}
