package solid.ocp;

public class Esporte implements ModoDirecao {

	public void trocaDirecao(Carro carro) {
		
		carro.setPotencia(500);
		carro.setAlturaSuspencao(10);
	}
}
