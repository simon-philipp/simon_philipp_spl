/*
 * Main Klasse
 * Parameter zum an und abwählen der Features sind:
 * 'setWirelessSystemTrue' or in short 'wst'
 * 'setWirelessSystemFalse' or 'wsf'
 * 'setCableSystemTrue' or 'cst'
 * 'setCableSystemFalse' or 'csf'
 * 
 * Das SmartHome wird mit dem Parameter 'sh' erstellt und aktuelle Konfigurationen können mit 'cc' angezeigt werden.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import properties.PropertyManager;

public class Main {

	public static void main(String[] args) throws IOException {
		if (PropertyManager.getProperty("Hardwaresystem")) {
			System.out.print("Hardwaresystem is ");
			
			if (PropertyManager.getProperty("WirelessSystem")) {
				System.out.print("-WirelessSystem ");
				Conf.WirelessSystem = true;
			} else {
				Conf.WirelessSystem = false;
			}
			if (PropertyManager.getProperty("CableSystem")) {
				System.out.print("-CableSystem ");
				Conf.CableSystem = true;
			} else {
				Conf.CableSystem = false;
			}
			System.out.println(" ");
		}
		
		while(true) {
			
			System.out.println("Chose a parameter to change: ");
			System.out.println("'setWirelessSystemTrue' or in short 'wst'");
			System.out.println("'setWirelessSystemFalse' or 'wsf'");
			System.out.println("'setCableSystemTrue' or 'cst'");
			System.out.println("'setCableSystemFalse' or 'csf'");
			System.out.println("generate SmartHome with 'sh'");
			System.out.println("current Conf 'cc'");
			
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
					if (Conf.WirelessSystem == true || Conf.CableSystem == true) {
						generateSmartHome();
					}
					else {
						System.out.println("Please " + Conf.SmartHomeOwner + " chose a Hardwaresystem. You cant build a Smarthome without it. Invalid Conf");

					}
				}
				if (input.contains("cc")) {
					getCurrentConf();
				}
			}
		}
	}
	
	public static void generateSmartHome() {
		SmartHome sh = new SmartHome(Conf.SmartHomeOwner);
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
