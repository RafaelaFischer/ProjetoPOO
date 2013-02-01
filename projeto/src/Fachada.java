
public class Fachada {
		private static Fachada fachada;
		private ControleDeNivel controleDeNivel;
		private ControleDePontuacao cPontuacao;
		 
		
	private Fachada(){
		controleDeNivel = new ControleDeNivel();
		cPontuacao = new ControleDePontuacao(0);
		
	}
	
	public static Fachada getInstance(){
		if(fachada==null){
			fachada=new Fachada();
		}
		return fachada;
	}
	
	public void adicionaNivel(int numero){
		controleDeNivel.adicionaNivel(numero);
	}
	
	public void remover(int numero){
		controleDeNivel.remover(numero);
	}	
	public void alteraNivel(int numero, int novoNumero){
		controleDeNivel.alteraNivel(numero, novoNumero);	
	}
		
	public Nivel pesquisa(int numero){
		return controleDeNivel.pesquisa(numero);
	}
	
	public boolean verificarResposta(Pergunta p, String resposta){
		return cPontuacao.verificarResposta(p, resposta);
	}
	
	public int getPontuacao() {
		return cPontuacao.getPontuacao();
	}
	
	
		

}
