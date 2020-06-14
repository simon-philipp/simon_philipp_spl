
public class SmartHome {
	
	public SmartHome(String sho) {
		System.out.println("Build a new SmartHome for " + sho);
		Hardwaresystem hs = new Hardwaresystem();
		
		//#if WeatherStation
//@			WeatherStation weatherstation = new WeatherStation();
//@			WindowsCtrl windowsctrl = new WindowsCtrl(weatherstation);
		//#else
			WindowsCtrl windowsctrl1 = new WindowsCtrl();
		//#endif
	}

	public SmartHome(String smartHomeOwner, WeatherStation weatherstation) {
		System.out.println("Build a new SmartHome for " + smartHomeOwner);
		Hardwaresystem hs = new Hardwaresystem();
		
	}
}
