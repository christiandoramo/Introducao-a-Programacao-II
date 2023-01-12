package projeto2va;

import java.util.Scanner;

// Sistema de manutenção dos games com acesso ao sistema de registros
public class SystemManager {
	Scanner sc = new Scanner(System.in);
	RegisterManager rm = new RegisterManager();
	private User usuario;
	private int usuariosLogados = 0;

	public void iniciarSessao() {
		System.out.println("Inicio de ssessão");
		try {
			Thread.sleep(3000);
		}catch(Exception e){
			System.out.println("Erro: "+e);
		}
		
		System.out.print("Nome do usuario: ");
		usuario = new User(++usuariosLogados, sc.nextLine());
	}
	public void mostrarOpcoes() {	
		System.out.print("1: ");
		System.out.print("1: comprar");
		System.out.print("1: devol");
		System.out.print("1: ");
		System.out.print("1: ");
		int opcao = sc.nextInt();
		switch(opcao) {
		case
		}
	}

	public int escolher() {
		return sc.nextInt();
	}

	public void escolhas() {

	}

	public void encerrarSessao() {
		sc.close();
	}
	// SISTEMA VENDA
	// ###############################################################################

	// SISTEMA VENDA
	// ###############################################################################
	public void vender(String nome, User usuario) {

	}

	// SISTEMA ALUGUEL - EMPRESTAR E RECEBER
	// ###############################################################################
	public void emprestar(String nome, User usuario) {

	}

	public void receber(String nome, User usuario) {

	}
}
