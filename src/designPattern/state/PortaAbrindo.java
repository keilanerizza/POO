package designPattern.state;

public class PortaAbrindo extends EstadoPorta {

	public PortaAbrindo(Porta p) {
		super();
		System.out.println("Porta abrindo...");
	}

	@Override
	public void end(Porta p) {
		try {
			Thread.sleep(3000);
			p.mudaEstado(new PortaAberta(p));
		} catch (Exception e) {
			
		}
	}

	@Override
	public void clicar(Porta p) {
		p.mudaEstado(new PortaFechando(p));
	}
}
