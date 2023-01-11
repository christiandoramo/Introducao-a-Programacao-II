package projeto2va;
import java.util.ArrayList;
import java.util.List;

public class GameCloud extends Game {

		private List<String> nomeUsuarios;
		private List<GameCloud> games;
		
		public GameCloud(){
			nomeUsuarios = new ArrayList<String>();
		 }    
		public GameCloud(boolean bool){   // quando for passado o parametro true ele cria uma lista, vai ser usado na primeira vez
		        this();
		        if(bool == true) {
		            games = new ArrayList<GameCloud>();
		        	//nomeUsuarios = new ArrayList<String>();
		        }
		    }
		

		public void MostraUmGame(String titulo){ /// esta classe procura um livro pelo titulo e devolve todas as informações dele incluindo para quais pessoas ele foi emprestado
		        String disponivel;
		        for(GameCloud li : games) {
		            if(li.getTitulo().equals(titulo)){
		                if(disponibilidade(li.getTitulo()))
		                     disponivel = "disponivel";
		                else disponivel = "indisponivel";
		                System.out.println("Titulo: " + li.getTitulo() + "\n"+
		                "Autor: " + li.getProdutora() + "\n" + "Editora: " + li.getPublicadora() + "\n" +
		                "Ano: " + li.getAno() + " Valor: " + li.getValor() + "\n" +
		                "Status: "+ disponivel+ "\n");
		                
		                System.out.println("Emprestado Para: ");
		                for(String li2 : li.nomeUsuarios)
		                	System.out.println(li2);
		                return;
		            }
		        }  System.out.println("Indisponivel");     
		    }
		    
		//emprestar livro pega o titulo do livro e o nome de quem está pegando emprestado para salvar em "nomeUsuarios"   
	    public boolean emprestarGame(String titulo, String nomeDevedor){
		      if(disponibilidade(titulo)){  
		         for(int i = 0; i < games.size(); i++){
		             if(games.get(i).getTitulo().equals(titulo)){
		                int quant = games.get(i).getQuantidade() - 1;
		                games.get(i).setQuantidade(quant);
		                games.get(i).nomeUsuarios.add(nomeDevedor);
		                return true;
		              }
		          }
		      }return false;
		  }	
	    
	    //add um novo livro
	    public void addGames(GameCloud game){
	        games.add(game);
	    }
	    
	    //pega o nome do livro e de quem o pegou emprestado incremente a quantidade disponivel do livro e remove "nomeUsuarios"
	    public void devolveGame(String titulo, String usuario) {
	    	for(int i = 0; i < games.size(); i++) {
	    		 if(games.get(i).getTitulo().equals(titulo)){
	    			games.get(i).setQuantidade(getQuantidade()+1);
	    			games.get(i).nomeUsuarios.remove(usuario);
	    		}
	    	}
	    }
	    
		@Override
		protected boolean disponibilidade(String titulo) {
	        for(GameCloud li : games){
	            if(li.getTitulo().equals(titulo) && li.getQuantidade() > 0){ // == não funciona direito com string, apenas com tipo primitivos
	               return true;
	            }            
	        }return false;
		}
		
		
		@Override
		protected void ShowGames() {
	        String disponivel;

	        for(GameCloud li : games){
	            if(disponibilidade(li.getTitulo()))
	                disponivel = "disponivel";
	            else disponivel = "indisponivel";

	            System.out.println(li.getTitulo() + " -Preço: " +li.getValor() + " " + disponivel + " " + li.getQuantidade() );
	        }
			
		}	

}
