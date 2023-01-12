package projeto2va;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

// Sistema de Registros de Vendas, Emprestados, e Disponiveis != Games em si
public class RegisterManager {

	private List<RegistroGame> gamesParaVender = new ArrayList<>();
	private List<RegistroGame> gamesParaAlugar = new ArrayList<>();

	public int qteGameAVenda(String nome) {
		int sum = gamesParaVender.stream().filter(
				x -> x.getGame().getEstado().equals(Estado.VendaDisponivel) && x.getGame().getNome().equals(nome))
				.toList().size();
		return sum;
	}

	public int qteGameAlugavel(String nome) {
		int sum = gamesParaAlugar.stream().filter(
				x -> x.getGame().getEstado().equals(Estado.AluguelDisponivel) && x.getGame().getNome().equals(nome))
				.toList().size();
		return sum;
	}
	// C - create R - read U - update D - delete

	// CREATE
	// ###############################################################################

	public void addRegistroVenda(RegistroGame rg) {
		rg.getGame().setEstado(Estado.VendaDisponivel);
		gamesParaVender.add(rg);
	}

	public void addRegistroAluguel(RegistroGame rg) {
		rg.getGame().setEstado(Estado.AluguelDisponivel);
		gamesParaAlugar.add(rg);

	}

	// READ
	// ###############################################################################

	public void mostrarGames() {
		mostrarGamesAlugaveis();
		mostarGamesAVenda();
	}

	public void mostrarTodoOsRegistros() {
		int index = 0;
		for (RegistroGame game : gamesParaAlugar)
			System.out.println(++index + ": " + game);
		for (RegistroGame game : gamesParaVender)
			System.out.println(++index + ": " + game);
	}

	public void buscarUmGame(String nome) {
		// buscar um vendivel e um compravel e mostrar a quantidade e status
		List<RegistroGame> gameVendiveis = gamesParaVender.stream().filter(
				x -> x.getGame().getEstado().equals(Estado.VendaDisponivel) && x.getGame().getNome().equals(nome))
				.toList();
		List<RegistroGame> gameAlugaveis = (gamesParaAlugar.stream().filter(
				x -> x.getGame().getEstado().equals(Estado.AluguelDisponivel) && x.getGame().getNome().equals(nome))
				.toList());
		int quantidade = gameVendiveis.size();
		System.out.println(gameVendiveis.get(0) + " Quantidade: " + quantidade);
		quantidade = gameAlugaveis.size();
		System.out.println(gameAlugaveis.get(0) + " Quantidade: " + quantidade);
	}

	public void mostarGamesAVenda() {
		@SuppressWarnings("unchecked")
		Set<RegistroGame> gamesCompraveis = (Set<RegistroGame>) gamesParaVender.stream()
				.filter(x -> x.getGame().getEstado().equals(Estado.VendaDisponivel)).toList();
		for (RegistroGame registroGame : gamesCompraveis) {
			int quantidade = qteGameAVenda(registroGame.getGame().getNome());
			System.out.println(registroGame + " Quantidade: " + quantidade);

		}
	}

	public void mostrarGamesAlugaveis() {
		@SuppressWarnings("unchecked")
		Set<RegistroGame> gamesAlugaveis = (Set<RegistroGame>) gamesParaAlugar.stream()
				.filter(x -> x.getGame().getEstado().equals(Estado.AluguelDisponivel)).toList();
		for (RegistroGame registroGame : gamesAlugaveis) {
			System.out.println(registroGame + " Quantidade: ");
		}

	}

	// UPDATE
	// ###############################################################################

	public void atualizarNomedeUmAVenda(String nome) {
		Consumer<RegistroGame> consumer = x -> x.getGame().setNome(nome);
		gamesParaVender.forEach(consumer);
	}

	public void atualizarNomedeUmAlugavel(String nome) {
		Consumer<RegistroGame> consumer = x -> x.getGame().setNome(nome);
		gamesParaAlugar.forEach(consumer);
	}

	public void atualizarPrecodeUmAVenda(float preco) {
		Consumer<RegistroGame> consumer = x -> x.setPreco(preco);
		gamesParaVender.forEach(consumer);
	}

	public void atualizarPrecodeUmAlugavel(float preco) {
		Consumer<RegistroGame> consumer = x -> x.setPreco(preco);
		gamesParaAlugar.forEach(consumer);
	}
	// DELETE
	// ###############################################################################

	public void removerUmGameAlugavel(String nome) {
		List<RegistroGame> listaDeRemovidos = gamesParaAlugar.stream().filter(x -> x.getGame().getNome().equals(nome))
				.toList();
		gamesParaAlugar.removeAll(listaDeRemovidos);
	}

	public void removerUmGameAVenda(String nome) {
		List<RegistroGame> listaDeRemovidos = gamesParaVender.stream().filter(x -> x.getGame().getNome().equals(nome))
				.toList();
		gamesParaVender.removeAll(listaDeRemovidos);
	}
}
