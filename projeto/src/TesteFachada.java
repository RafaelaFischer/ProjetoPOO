import static org.junit.Assert.*;

import org.junit.Test;




public class TesteFachada{
	
	@Test
	public void TesteAdicionarNivel(){
		Pergunta pergunta = new Pergunta("Elefante","E");
		Fachada.getInstance().adicionaNivel(1);
		Nivel n = Fachada.getInstance().pesquisa(1);
		n.adicionar(pergunta);
		assertEquals(n.pesquisa("Elefante"),pergunta);
	}
	
	
	
	
	
	
	

}
