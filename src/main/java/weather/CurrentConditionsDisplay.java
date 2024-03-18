package weather;
	
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
//	public void changeProvider(Subject provider){
//		// de-register with the old one
//		deregister();
//		this.weatherData = provider;
//		registerToGetUpdates();
//	}
	public void registerToGetUpdates(){
		this.weatherData.registerObserver(this);
	}

	public void deregister(){
		this.weatherData.removeObserver(this);
	}

	public void changeProvider(Subject weatherData){
		this.weatherData = weatherData;
	}
}
