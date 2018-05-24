package designPattern.state;

public class PermanenteAberta extends EstadoPorta {
	
	public PermanenteAberta() {
		super();
		System.out.println("Porta permanentemente aberta !");
	}

	@Override
	public void clicar(Porta p) {
		new PortaFechando(p);
	}
}
