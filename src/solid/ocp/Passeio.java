package solid.ocp;

public class Passeio implements ModoDirecao{
	
	public void trocaDirecao(Carro carro){
		
		carro.setPotencia(400);
		carro.setAlturaSuspencao(20);
	}
}
