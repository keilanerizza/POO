package aula2702;

public class Conta {
	private String titular;
	private static int identificador;
	private double saldo;
	private double limite;
	private static int totalDeContas;
	
	//4 - Por que você precisa do construtor sem argumentos para que a passagem do nome seja opcional?
	// R: Pois sempre que a classe for instanciada e caso eu nao tenha um contrutor sem argumentos, 
	// será obrigatorio a passagem do nome.
	
	Conta(){
		Conta.identificador ++;
	}
	
	Conta(String titular) {
		Conta.identificador ++;
        this.titular = titular;
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }
	
	boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
	
	boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
            // não deu pra sacar!
            return false;
        }
        else {
            destino.deposita(valor);
            return true;
        }
    }

	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }
	
	// 5 - Crie um getter para o identificador. Devemos ter um setter?
	// R: Não é necessário criar um setter, pois o identificador é calculado nos contrutores.
	public static int getIdentificador() {
		return Conta.identificador;
	}
}
