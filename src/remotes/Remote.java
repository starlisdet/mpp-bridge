package remotes;

public interface Remote { // declara��o de m�todos de interface
	
	void power(); // controle remoto liga
	void volumeDown(); // controle remoto diminui volume
	void volumeUp(); // controle remoto aumenta volume
	void channelDown(); // controle remoto muda de canal (-1)
	void channelUp(); // controle remoto muda de canal (+1)

}
