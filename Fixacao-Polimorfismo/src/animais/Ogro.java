package animais;

public class Ogro extends Monstro implements IRastejador {
	public void rastejaEAtaca() {
		System.out.println("Eu sou verde e feliz, meu nome � Shrek");
	}

	public boolean estouEmPe() {
		return false;
	}
}