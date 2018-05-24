package designPattern.state;

public class PortaFechando extends EstadoPorta {
	
	public PortaFechando(Porta p) {
		super();
		System.out.println("Porta fechando...");
	}
	
	@Override
	public void end(Porta p) {
		try {
			Thread.sleep(3000);
			p.mudaEstado(new PortaFechada());
		} catch (Exception e) {
			
		}
	}

	@Override
	public void clicar(Porta p) {
		p.mudaEstado(new PortaAbrindo(p));
	}
}
