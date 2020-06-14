
public class WindowsCtrl {
	public WindowsCtrl(WeatherStation weatherstation) {
		//#if ManualWindows || AutomatedWindows
		//#if ManualWindows
		ManualWindows mw = new ManualWindows();
		//#endif
		//#if AutomatedWindows
//@		AutomatedWindows aw = new AutomatedWindows(weatherstation);
		//#endif
	//#else
//@			System.out.println("Your Smarthome has windows that you cant open");
	//#endif
	}
	public WindowsCtrl() {
			//#if ManualWindows || AutomatedWindows
			//#if ManualWindows
			ManualWindows mw = new ManualWindows();
			//#endif
			//#if AutomatedWindows
//@			if (Conf.WeatherStation) {
//@				AutomatedWindows aw = new AutomatedWindows();
//@			} else {
//@				System.out.println("you have to configure a weather station to use automated windows");
//@			}
			//#endif
		//#else
//@			System.out.println("Your Smarthome has windows that you cant open");
		//#endif
	}
		
}
