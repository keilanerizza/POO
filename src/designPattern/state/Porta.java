package designPattern.state;

public class Porta {
	EstadoPorta estado;
	
	public Porta() {
		estado = new PortaFechada();
	}
	
	public void mudaEstado(EstadoPorta estado) {
		this.estado = estado;
	}
	
	void timeOut() {
		estado.timeOut(this);
	}
	
	void end() {
		estado.end(this);
	}
	
	void clicar() {
		estado.clicar(this);
	}
	
	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.clicar();
		porta.end();
		porta.clicar();
		porta.clicar();
  	}
	
}
