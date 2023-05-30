package remotes;

import devices.Device;

public class BasicRemote implements Remote {
	protected Device device;
	
	public BasicRemote() {}
	
	public BasicRemote(Device device) {
		this.device = device;
	}
	
	@Override
	public void power() { // método de ligar e desligar com o controle
		System.out.println("Remote: power toggle");
		if (device.isEnabled()) {
			device.disable();
		} else {
			device.enable();
		}
	}
	
	@Override
	public void volumeDown() { // método de abaixar o volume
		System.out.println("Remote: volume down");
		device.setVolume(device.getVolume() - 10);
	}
	
	@Override
	public void volumeUp() { // método de aumentar o volume
		System.out.println("Remote: volume up");
		device.setVolume(device.getVolume() + 10);
	}
	
	@Override
	public void channelDown() { // método de mudar de canal (-1)
		System.out.println("Remote: channel down");
		device.setChannel(device.getChannel() - 1);
	}
	
	@Override
	public void channelUp() { // método de mudar de canal (+1)
		System.out.println("Remote: channel up");
		device.setChannel(device.getChannel() + 1);
	}

}
