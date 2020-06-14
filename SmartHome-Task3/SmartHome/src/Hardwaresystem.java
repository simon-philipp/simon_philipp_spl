
public class Hardwaresystem {
	
	public Hardwaresystem(){
		//#if WirelessSystem || CableSystem
			//#if WirelessSystem
			WirelessSystem wls = new WirelessSystem();
			//#endif
			//#if CableSystem
//@			CableSystem cs = new CableSystem();
			//#endif
		//#else
//@			System.out.println("Please " + Conf.SmartHomeOwner + " chose a Hardwaresystem. You cant build a Smarthome without it");
		//#endif
		
	}
}
