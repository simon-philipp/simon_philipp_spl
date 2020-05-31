import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import properties.PropertyManager;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Your default configuration is:");
		
		if (PropertyManager.getProperty("Hardwaresystem")) {
			System.out.print("Hardwaresystem is ");
			
			if (PropertyManager.getProperty("WirelessSystem")) {
				System.out.print("WirelessSystem ");
				Conf.WirelessSystem = true;
			}
			if (PropertyManager.getProperty("CableSystem")) {
				System.out.print("CableSystem ");
				Conf.CableSystem = true;
			}	
			System.out.println(" ");
		}
		
		while(true) {
			
			System.out.println("Chose a parameter to change: ");
			System.out.println("setWirelessSystemTrue or in short wst");
			System.out.println("setWirelessSystemFalse or wsf");
			System.out.println("setCableSystemTrue or cst");
			System.out.println("setCableSystemFalse or csf");
			System.out.println("generate SmartHome with sh");
			
			while(true) {
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				String input = br.readLine();
			
				if (input.contains("setWirelessSystemTrue") || input.contains("wst")) {
					Conf.WirelessSystem = true;
					System.out.println("set wireless system true");
				}
				if (input.contains("setWirelessSystemFalse") || input.contains("wsf")) {
					Conf.WirelessSystem = false;
					System.out.println("set wireless system false");
				}
				if (input.contains("setCableSystemTrue") || input.contains("cst")) {
					Conf.CableSystem = true;
					System.out.println("set cable system true");
				}
				if (input.contains("setCableSystemFalse") || input.contains("csf")) {
					Conf.CableSystem = false;
					System.out.println("set cable system false");
				}
				if (input.contains("sh")) {
					generateSmartHome();
				}
			}
		}
	}
	
	public static void generateSmartHome() {
		SmartHome sh = new SmartHome(Conf.SmartHomeOwner);
	}
}
