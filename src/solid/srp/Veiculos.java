package solid.srp;

public class Veiculos {
	private final int capacidadeTanqueCombustivel;
    private int quantidadeCombustivel;

    public Veiculos(int capacidadeTanque) {
        this.capacidadeTanqueCombustivel = capacidadeTanque;
        quantidadeCombustivel = capacidadeTanque;
    }

    public int getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(int quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}

	public int getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	}

    public void acelerar() {
        quantidadeCombustivel--;
    }
}
