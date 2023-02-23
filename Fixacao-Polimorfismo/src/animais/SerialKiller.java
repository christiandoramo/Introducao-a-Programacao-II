package animais;

public class SerialKiller extends Cacador implements ICorredor {
	@Override
	public void correEAtaca() {
		System.out.println("Sou assassino e mato a sangue frio");
	}

	@Override
	public int tempoDeCaca() {
		return 17;
	}
	@Override
	public boolean estouEmPe() {
		return true;
	}
}
