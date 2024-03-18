package weather;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}

// whoever wants to be provider they need to ensure they are
// implementing above methods
