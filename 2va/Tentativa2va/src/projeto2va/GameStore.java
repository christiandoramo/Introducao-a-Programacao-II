package projeto2va;

public class GameStore {
    private List<GameStore> games;

	  
    public GameStore(){}    
    // quando for passado o parametro true ele cria uma lista, vai ser usado na primeira vez
    public GameStore(boolean bool){
        this();
        if(bool == true)     
            games = new ArrayList<GameStore>();         
    }
  

    public void addgames(GameStore game){
        games.add(game);
    }
    public boolean vendeLivro(String titulo){
        if(disponibilidade(titulo)){  
           for(int i = 0; i < games.size(); i++){
               if(games.get(i).getTitulo().equals(titulo)){
                  int quant = games.get(i).getQuantidade() - 1;
                  games.get(i).setQuantidade(quant);
                  return true;
                }
            }
        }return false;
    }

    /// esta classe procura um livro pelo titulo e devolve todas as informações dele 
    public void MostraUmGame(String titulo){
        String disponivel;
        for(GameStore li : games) {
            if(li.getTitulo().equals(titulo)){
                if(disponibilidade(li.getTitulo()))
                     disponivel = "disponivel";
                else disponivel = "indisponivel";
                System.out.println("Titulo: " + li.getTitulo() + "\n"+
                "Autor: " + li.getProdutora() + "\n" + "Publicadora: " + li.getPublicadora() + "\n" +
                "Ano: " + li.getAno() + " Valor: " + li.getValor() + "\n" +
                "Status: "+ disponivel+ "\n");
                return;
            }
        }  System.out.println("Indisponivel");     
    }
  
    public void ShowGames(){
        String disponivel;

        for(GameStore li : games){
            if(disponibilidade(li.getTitulo()))
                disponivel = "disponivel";
            else disponivel = "indisponivel";

            System.out.println(li.getTitulo() + " -Preço: " +li.getValor() + " " + disponivel + " " + li.getQuantidade() );
        }
    }

    protected boolean disponibilidade(String titulo) {
        for(GameStore li : games){
            if(li.getTitulo().equals(titulo) && li.getQuantidade() > 0){ // == não funciona direito com string, apenas com tipo primitivos
               return true;
            }            
        }
        return false;
    }  
}
