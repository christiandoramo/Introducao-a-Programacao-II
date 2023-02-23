package animais;

public class TRex extends Monstro implements IRastejador, ICorredor {
	public void correEAtaca() {
		System.out.println("Eu rasgo os inimigos ao meio");
	}

	public void rastejaEAtaca() {
		System.out.println("Morto silecioniosamente pelo TRex");
	}

	public boolean estouEmPe() {
		return true;
	}
}