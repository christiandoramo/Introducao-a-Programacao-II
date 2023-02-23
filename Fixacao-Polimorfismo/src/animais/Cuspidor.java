package animais;

public class Cuspidor extends Monstro implements ICorredor {
	public void correEAtaca() {
		System.out.println("Eu cuspo veneno");
	}

	public int huntingTime() {
		return 92;
	}

	public boolean estouEmPe() {
		return false;
	}
}