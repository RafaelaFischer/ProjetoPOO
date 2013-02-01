import java.util.ArrayList;
import java.util.List;


public class ControleDeNivel {
	
	private List<Nivel> niveis;
	
	
	public ControleDeNivel(){
		niveis= new ArrayList<Nivel>();
	}
	
	public void adicionaNivel(int numero){
		Nivel nivel = new Nivel(numero);
		this.niveis.add(nivel);
	}
	
	public void remover(int numero){
		
		for(Nivel n : niveis){
			if(n.getNumero()==numero){
				niveis.remove(n);
			}
		}
	}
	
	
	public void alteraNivel(int numero, int novoNumero){
		
		for(Nivel n : niveis){
			if(n.getNumero()==numero){
				n.setNumero(novoNumero);
			}
				
			}
		}
		
	public Nivel pesquisa(int numero){
		for(Nivel n : niveis){
			if(n.getNumero()==numero){
				return n;
			}
		}
		return null;
	}

	
	

}
