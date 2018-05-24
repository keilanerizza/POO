package designPattern.state;

public class PortaFechada extends EstadoPorta {
	
	public PortaFechada() {
		super();
		System.out.println("Porta Fechada !");
	}

	@Override
	public void clicar(Porta p) {
		p.mudaEstado(new PortaAbrindo(p));
	}
}
