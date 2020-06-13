
public class Hardwaresystem {
	
	public Hardwaresystem(){
		if (Conf.WirelessSystem == true || Conf.CableSystem == true) {
			if (Conf.WirelessSystem == true) {
			WirelessSystem wls = new WirelessSystem();
			}
			if (Conf.CableSystem == true) {
			CableSystem cs = new CableSystem();
			}
		} else {
			System.out.println("Please " + Conf.SmartHomeOwner + " chose a Hardwaresystem. You cant build a Smarthome without it");
		}
	}
}
