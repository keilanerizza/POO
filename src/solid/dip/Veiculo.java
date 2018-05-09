package solid.dip;

public abstract class Veiculo {
	private int capacidadeTanqueCombustivel;
    private int quantidadeCombustivel;
    private int potencia;
    
    public Veiculo(int combustivel) {
		super();
		this.capacidadeTanqueCombustivel = combustivel;
		this.quantidadeCombustivel = combustivel;
	}

	public void setCapacidadeTanqueCombustivel(int capacidadeTanqueCombustivel) {
		this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
	}

	void acelerar() {}

	public int getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(int quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	};
}
