import interfaces.HardwaresystemInterface;
import interfaces.SmartHomeInterface;
import interfaces.UiInterface;
import interfaces.WindowsCtrlInterface;
import loader.PluginLoader;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SmartHomeInterface> smartHomeList = PluginLoader.load(SmartHomeInterface.class);
		for(SmartHomeInterface sH : smartHomeList) {
			sH.smartHomePrint();
		}
		
		List<HardwaresystemInterface> hardwaresystemList = PluginLoader.load(HardwaresystemInterface.class);
		for(HardwaresystemInterface hi : hardwaresystemList) {
			hi.printHardwaresystem();
		}
		
		List<WindowsCtrlInterface> windowsCtrlList = PluginLoader.load(WindowsCtrlInterface.class);
		for(WindowsCtrlInterface wci : windowsCtrlList) {
			wci.WindowsCtrlPrint();
		}

		List<UiInterface> UiList = PluginLoader.load(UiInterface.class);
		for(UiInterface uii : UiList) {
			uii.printUI();;
		}
	}

}
