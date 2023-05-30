package remotes;

import devices.Device;

public class AdvancedRemote extends BasicRemote {
	
	public AdvancedRemote(Device device) { // controle remoto avançado herda os métodos da interface
		super.device = device;
	}

	public void mute() {
		System.out.println("Remote: mute"); // controle remoto muta o volume
		device.setVolume(0);
	}
}
