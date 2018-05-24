package designPattern.strategy.mensagem_diaria;

public class ImprimeMensagemDoDia {
	
	private Dia dia;

	public ImprimeMensagemDoDia(Dia dia) {
		super();
		this.dia = dia;
	}
	
	void imprime() {
		dia.escreveMensagem();
	}

	public static void main(String[] args) {
		ImprimeMensagemDoDia doDia = new ImprimeMensagemDoDia(new Domingo());
		doDia.imprime();
	}
}
