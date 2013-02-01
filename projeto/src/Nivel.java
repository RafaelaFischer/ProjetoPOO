import java.util.ArrayList;
import java.util.List;


public class Nivel {
	private int numero;
	private List<Pergunta> perguntas;
	
	public Nivel(int numero){
		perguntas = new ArrayList<Pergunta>();
		this.numero=numero;
	}
	
	
	
	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public void adicionar(Pergunta p){
		this.perguntas.add(p);
	}
	
	public void remover(Pergunta p){
		
		for(Pergunta perg : perguntas){
			if(perg.equals(p)){
				perguntas.remove(p);
			}
		}
	}
	
	public void alteraPergunta(Pergunta p, String resposta, String pergunta){
		
		for(Pergunta perg : perguntas){
			if(perg.equals(p)){
				perg.setPergunta(pergunta);
				perg.setResposta(resposta);
			}
		}
		
	}
	
	public Pergunta pesquisa(String pergunta){
		for(Pergunta perg : perguntas){
			if(perg.getPergunta().equals(pergunta)){
				return perg;
			}	
		}
		return null;
	}
}
