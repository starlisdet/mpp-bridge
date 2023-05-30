package example;

import devices.Device;
import devices.Radio;
import devices.Tv;
import remotes.AdvancedRemote;
import remotes.BasicRemote;

public class Demo { // teste de aparelhos
	public static void main(String[] args) {
		testDevice(new Tv());
		testDevice(new Radio());
	}
	
	public static void testDevice(Device device) { // teste com controle remoto b�sico
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();
		
		System.out.println("Tests with advanced remote."); // teste com controle remoto avan�ado
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}

}
