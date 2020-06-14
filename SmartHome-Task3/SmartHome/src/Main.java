import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static WeatherStation weatherstation = null;

	public static void main(String[] args) {
		//#if Hardwaresystem 
			System.out.println("Hardwaresystem is: ");
			//#if WirelessSystem
				System.out.println("-WirelessSystem");
				Conf.WirelessSystem = true;
			//#else
//@				Conf.WirelessSystem = false;
			//#endif
			//#if CableSystem
//@				System.out.println("-CableSystem ");
//@				Conf.CableSystem = true;
			//#else
				Conf.CableSystem = false;
			//#endif
		//#endif
				
		//#if WeatherStation
//@				System.out.println("The weather station is configured");
//@				Conf.WeatherStation = true;
		//#else
				Conf.WeatherStation = false;
		//#endif
				
		//#if WindowsCtrl
			System.out.println("Windowssystem is: ");
			//#if ManualWindows	
			System.out.println("-ManualWindows");
			Conf.ManualWindows = true;
			//#else
//@			Conf.ManualWindows = false;
			//#endif
			//#if AutomatedWindows
//@				System.out.println("-AutomatedWindows");
//@				Conf.AutomatedWindows = true;
				//#else
				Conf.AutomatedWindows = true;
			//#endif
		//#endif
		
				
		generateSmartHome();
		
}
	public static void generateSmartHome() {
		if (weatherstation == null) {
			SmartHome sh = new SmartHome(Conf.SmartHomeOwner);
		} 
	}
	
	public static void getCurrentConf() {
		System.out.println("Your current configuration is:");
		
		if (Conf.Hardwaresystem) {
			System.out.print("Hardwaresystem is ");
			
			if (Conf.WirelessSystem) {
				System.out.print("-WirelessSystem ");
			}
			else if (Conf.CableSystem) {
				System.out.print("-CableSystem ");
			} else {
				System.out.print("nothing -invalid");
			}
			System.out.println(" ");
		}
		
	}
}
