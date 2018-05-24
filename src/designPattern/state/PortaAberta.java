package designPattern.state;

public class PortaAberta extends EstadoPorta{
	
	public PortaAberta(Porta p) {
		super();
		System.out.println("Porta Aberta !");
	}
	
	@Override
	public void timeOut(Porta p) {
		try {
			Thread.sleep(3000);
			p.mudaEstado(new PortaFechando(p));
		} catch (Exception e) {
			
		}
	}

	@Override
	public void clicar(Porta p) {
		p.mudaEstado(new PermanenteAberta());	
	}
}
