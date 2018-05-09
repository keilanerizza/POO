package solid.dip;

public class Piloto {
	
	private Veiculo veiculo;

    public Piloto(){
        this.veiculo = new CarroDeCorrida(100);
    }

    public void aumentaVelocidade(){
        veiculo.acelerar();
    }
}
