
public class AutomatedWindows {
	public AutomatedWindows(){
		System.out.println("Windows can open and close automaticly");
	}

	public AutomatedWindows(WeatherStation weatherstation) {
		System.out.println("Windows can open and close automaticly");
		if (weatherstation.getCurrentWeather() == "cloudy") {
			System.out.println("Weather is " + weatherstation.getCurrentWeather() + ": windows closing");
		}
		
	}
}
