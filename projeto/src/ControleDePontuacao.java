
public class ControleDePontuacao {
	
	private int pontuacao;
	
	public ControleDePontuacao(int pontuacao){
		this.pontuacao=pontuacao;
	}
	
	public boolean verificarResposta(Pergunta p, String resposta){
		
		if(p.getResposta().equals(resposta)){
			pontuacao+=10;
			return true;
			
		}
		pontuacao-=2;
		return false;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	
	

}
