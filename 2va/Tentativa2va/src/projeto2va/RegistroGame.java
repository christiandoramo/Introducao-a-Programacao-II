package projeto2va;

public class RegistroGame {
	private int id;
	private Game game;
	private User usuario;
	private float preco;

	public RegistroGame(int id, Game game, User usuario,float preco) {
		this.id = id;
		this.game = game;
		this.usuario = usuario;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public User getUsuario() {
		return usuario;
	}
	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "game: " + game + " usuario: " + usuario + ", preco: " + preco;
	}
	
	
	
}