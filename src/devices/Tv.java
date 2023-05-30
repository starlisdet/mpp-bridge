package devices;

public class Tv implements Device {
	private boolean on = false;
	private int volume = 30;
	private int channel = 1;
	
	@Override
	public boolean isEnabled() {
		return on; // se est� ligado, retorna ligado
	}
	
	@Override
	public void enable() {
		on = true; // liga = on = true
	}

	@Override
	public void disable() {
		on = false; // desliga = on = false
	}
	
	@Override
	public int getVolume() {
		return volume; // pega o volume
	}
	
	@Override
	public void setVolume(int volume) {
		// se volume maior que 100, volume fica configurado para s� atingir 100 no m�ximo
		if (volume > 100) {
			this.volume = 100;
		} else if (volume < 0) { // se volume menor que 0, configurado para s� atingir 0 no m�nimo
			this.volume = 0;
		} else {
			this.volume = volume;
		}
	}
	
	@Override
	public int getChannel() {
		return channel; // pega o canal
	}
	
	@Override
	public void setChannel(int channel) {
		this.channel = channel; // configura o canal
	}

	@Override
	public void printStatus() { // status do r�dio, mostrando que est� ligado ou desligado, volume e canais atuais
		System.out.println("------------------");
		System.out.println("| I'm TV set.");
		System.out.println("| I'm "+ (on ? "enabled" : "disabled)"));
		System.out.println("| Current volume is "+ volume + "%");
		System.out.println("| Current channel is " + channel);
		System.out.println("-----------------\n");
		
	}
}
