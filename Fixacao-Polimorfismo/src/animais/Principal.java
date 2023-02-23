package animais;

public class Principal {
	public static void main(String[] args) {
		Monstro m1 = new Cuspidor();
		Monstro m2 = new SerialKiller();
		System.out.println("Is m2 standing: " + m2.estouEmPe());
		IRastejador c1 = new Ogro();
		c1 = m1;
		c1.rastejaEAtaca();
		c1 = new TRex();
		ICorredor r1 = (Cuspidor) m1;
		System.out.println(((Cacador) m2).tempoDeCaca());
		m2 = new Cacador();
		((Cacador) m2).cacarECapturar();
		((SerialKiller) m2).correEAtaca();
		m2 = new Ogro();
		m2 = c1;
		((ICorredor) m1).correEAtaca();
		m1 = new TRex();
		ICorredor r2 = new TRex();
		m2 = r1;
		System.out.println(m1.tempoDeCaca());
		((ICorredor) m1).correEAtaca();
		System.out.println(((Cacador) r2).tempoDeCaca());
		r1.correEAtaca();
	}
}