package devices;

public interface Device { // declara��o de m�todos de interface
	boolean isEnabled(); // est� ligado ou desligado
	void enable(); // ligado
	void disable(); // desligado
	int getVolume(); // pega o valor do volume
	void setVolume(int percent); // configura o volume
	int getChannel(); // pega o canal
	void setChannel(int channel); // configura o canal
	void printStatus(); // printa o status do aparelho

}
